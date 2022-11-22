package com.gildedrose.items;

public class TimeImprovedItem extends ClassicItem {

	public TimeImprovedItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.qualityLoss = 1;
	}


}
