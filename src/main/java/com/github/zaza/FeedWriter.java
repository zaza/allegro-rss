package com.github.zaza;

import static java.lang.String.format;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.allegro.webapi.ArrayOfPriceinfotype;
import com.allegro.webapi.PhotoInfoType;
import com.allegro.webapi.UserInfoType;
import com.github.zaza.allegro.Item;
import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.feed.synd.SyndImage;
import com.rometools.rome.feed.synd.SyndImageImpl;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedOutput;

public class FeedWriter {

	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm");

	public String write(SearchResult result) throws IOException, FeedException {
		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType("rss_2.0");

		feed.setTitle(format("Allegro.pl \"%s\"", result.getFilterDescription()));
		feed.setLink(result.getQueryUrl());
		feed.setDescription("Oferty sprzedaży spełniające Twoje kryteria wyszukiwania");

		SyndImage image = new SyndImageImpl();
		image.setTitle("Allegro.pl");
		image.setUrl("https://allegro.pl/favicon.ico");
		image.setLink("https://allegro.pl");
		feed.setImage(image);

		List<SyndEntry> entries = result.getItems().stream().map(i -> feedEntry(i)).collect(Collectors.toList());
		feed.setEntries(entries);
		return write(feed);
	}

	private SyndEntry feedEntry(Item item) {
		SyndEntry entry = new SyndEntryImpl();
		entry.setTitle(item.getItemTitle());
		entry.setLink("http://allegro.pl/show_item.php?item=" + item.getItemId());
		entry.setPublishedDate(new Date());
		entry.setDescription(createDescription(item));
		return entry;
	}

	private SyndContent createDescription(Item item) {
		SyndContent description = new SyndContentImpl();
		description.setType("text/html");
		StringBuilder sb = new StringBuilder();
		sb.append(formatSellerInfo(item.getSellerInfo()));
		sb.append(formatPriceInfo(item.getPriceInfo()));
		sb.append(formatTime(item.getTimeToEnd(), item.getEndingTime()));
		sb.append(formatLocation(item));
		sb.append(formatPhotosInfo(item.getPhotos()));
		description.setValue(sb.toString());
		return description;
	}

	private String formatPhotosInfo(List<PhotoInfoType> photos) {
		if (photos.isEmpty())
			return "";
		for (PhotoInfoType photo : photos) {
			if (photo.isPhotoIsMain())
				return asImg(photo);
		}
		// if no main photo found, use the first one
		return asImg(photos.get(0));
	}

	private String asImg(PhotoInfoType photo) {
		return format("<img src=\"%s\" width=\"128\" height=\"96\" alt=\"\" ><br />", photo.getPhotoUrl());
	}

	private String formatTime(String timeToEnd, Calendar endingTime) {
		if (endingTime != null)
			return format("Do końca: %s (%s)<br />", timeToEnd, DATE_FORMAT.format(endingTime.getTime()));
		else
			return format("Do końca: %s<br />", timeToEnd);
	}

	private String formatSellerInfo(UserInfoType sellerInfo) {
		return format("Sprzedający: <a href=\"http://allegro.pl/show_user.php?uid=%d\">%s</a> (%d)<br />",
				sellerInfo.getUserId(), sellerInfo.getUserLogin(), sellerInfo.getUserRating());
	}

	private String formatPriceInfo(ArrayOfPriceinfotype priceInfo) {
		return format("Cena: %.2f zł<br />", priceInfo.getItem(0).getPriceValue());
	}

	private String formatLocation(Item item) {
		return format("Lokalizacja: %s (%s)<br />", item.getLocation(), item.getState());
	}

	private String write(SyndFeed feed) throws IOException, FeedException {
		Writer writer = new StringWriter();
		SyndFeedOutput output = new SyndFeedOutput();
		output.output(feed, writer);
		writer.close();
		return writer.toString();
	}
}
