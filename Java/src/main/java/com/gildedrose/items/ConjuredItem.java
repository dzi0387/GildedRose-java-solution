package com.gildedrose.items;

public class ConjuredItem extends ClassicItem {

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.qualityLoss *= 2;
	}
	
	@Override
	public void update() {
		this.setQuality(this.getQuality() + qualityLoss);

		nextDay();
	}
}
