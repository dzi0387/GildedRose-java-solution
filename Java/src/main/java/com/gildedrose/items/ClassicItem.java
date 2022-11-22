package com.gildedrose.items;

public class ClassicItem extends AbstractExpireableItem {
	public int qualityLoss = -1;

	public ClassicItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void update() {
		this.setQuality(this.getQuality() + ((getSellIn() <= 0) ? 2 * qualityLoss : qualityLoss));

		nextDay();
	}

}
