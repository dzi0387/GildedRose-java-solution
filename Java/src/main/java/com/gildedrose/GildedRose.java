package com.gildedrose;

import java.util.Arrays;
import java.util.List;

import com.gildedrose.items.AbstractExpireableItem;

import lombok.Getter;

@Getter
public class GildedRose {

	private List<AbstractExpireableItem> items;

	public GildedRose(AbstractExpireableItem[] items) {
		this.items = Arrays.asList(items);
	}

	public void updateQuality() {
		this.items.stream().forEach(item -> item.update());
	}
}