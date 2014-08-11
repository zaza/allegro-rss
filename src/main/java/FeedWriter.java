import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.rometools.rome.feed.synd.SyndContent;
import com.rometools.rome.feed.synd.SyndContentImpl;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndEntryImpl;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedOutput;

public class FeedWriter {
	
	 private static final DateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd");
	

String write() throws ParseException, IOException, FeedException {
	SyndFeed feed = new SyndFeedImpl();
	feed.setFeedType("rss_2.0");

	feed.setTitle("Sample Feed (created with ROME)");
	feed.setLink("http://rome.dev.java.net");
	feed.setDescription("This feed has been created using ROME (Java syndication utilities");
	
	List<SyndEntry> entries = new ArrayList<>();
	SyndEntry entry;
	SyndContent description;

	entry = new SyndEntryImpl();
	entry.setTitle("ROME v1.0");
	entry.setLink("http://wiki.java.net/bin/view/Javawsxml/Rome01");
	entry.setPublishedDate(DATE_PARSER.parse("2004-06-08"));
	description = new SyndContentImpl();
	description.setType("text/plain");
	description.setValue("Initial release of ROME");
	entry.setDescription(description);
	entries.add(entry);
	entry = new SyndEntryImpl();
	entry.setTitle("ROME v3.0");
	entry.setLink("http://wiki.java.net/bin/view/Javawsxml/Rome03");
	entry.setPublishedDate(DATE_PARSER.parse("2004-07-27"));
	description = new SyndContentImpl();
	description.setType("text/html");
	description.setValue("<p>More Bug fixes, mor API changes, some new features and some Unit testing</p>"+
	                     "<p>For details check the <a href=\"https://rometools.jira.com/wiki/display/ROME/Change+Log#ChangeLog-Changesmadefromv0.3tov0.4\">Changes Log</a></p>");
	entry.setDescription(description);
	entries.add(entry);
	
	feed.setEntries(entries);
	
	Writer writer = new StringWriter();
	SyndFeedOutput output = new SyndFeedOutput();
    output.output(feed,writer);
    writer.close();
    
    return writer.toString();
}
}
