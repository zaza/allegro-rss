package com.github.zaza.allegro;

import java.util.Calendar;

import com.allegro.webapi.ArrayOfPhotoinfotype;
import com.allegro.webapi.ArrayOfPriceinfotype;
import com.allegro.webapi.ItemInfo;
import com.allegro.webapi.ItemsListType;
import com.allegro.webapi.UserInfoType;

public class Item {

	private ItemsListType itemsListType;

	private ItemInfo itemInfo;

	public Item(ItemsListType itemsListType, ItemInfo itemInfo) {
		this.itemsListType = itemsListType;
		this.itemInfo = itemInfo;
	}

	public String getItemTitle() {
		return itemsListType.getItemTitle();
	}

	public long getItemId() {
		return itemsListType.getItemId();
	}

	public UserInfoType getSellerInfo() {
		return itemsListType.getSellerInfo();
	}

	public ArrayOfPriceinfotype getPriceInfo() {
		return itemsListType.getPriceInfo();
	}

	public String getTimeToEnd() {
		return itemsListType.getTimeToEnd();
	}

	public Calendar getEndingTime() {
		return itemsListType.getEndingTime();
	}

	public ArrayOfPhotoinfotype getPhotosInfo() {
		return itemsListType.getPhotosInfo();
	}

	public String getLocation() {
		return itemInfo.getItLocation();
	}

	public String getState() {
		return State.valueOf(itemInfo.getItState()).name();
	}
}
