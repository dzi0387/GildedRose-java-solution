package com.gildedrose.items;

public class QualitySellInLinkedItem extends AbstractExpireableItem {

	public QualitySellInLinkedItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void update() {
		int quality = getQuality();

		if (getSellIn() <= 0) {
			quality = 0;
		} else if (getSellIn() <= 5) {
			quality += 3;
		} else if (getSellIn() <= 10) {
			quality += 2;
		} else {
			++quality;
		}
		this.setQuality(quality);

		this.nextDay();
	}

}
