package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class AbstractExpireableItem extends Item {

	public final int MIN_QUALITY = 0;
	public final int MAX_QUALITY = 50;

	public AbstractExpireableItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void setQuality(int quality) {
		if (quality < MIN_QUALITY) {
			this.quality = MIN_QUALITY;
		} else if (quality > MAX_QUALITY) {
			this.quality = MAX_QUALITY;
		} else {
			this.quality = quality;
		}
	}

	public int getQuality() {
		return quality;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int value) {
		this.sellIn = value;
	}

	public String getName() {
		return name;
	}

	public void nextDay() {
		--this.sellIn;
	}

	public abstract void update();
}
