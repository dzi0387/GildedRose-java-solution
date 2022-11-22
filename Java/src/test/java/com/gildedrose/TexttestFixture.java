package com.gildedrose;

import com.gildedrose.items.AbstractExpireableItem;
import com.gildedrose.items.ClassicItem;
import com.gildedrose.items.ConjuredItem;
import com.gildedrose.items.LegendaryItem;
import com.gildedrose.items.QualitySellInLinkedItem;
import com.gildedrose.items.TimeImprovedItem;

public class TexttestFixture {
	public static void main(String[] args) {
		System.out.println("OMGHAI!");

		AbstractExpireableItem[] items = new AbstractExpireableItem[] {
				new ClassicItem("+5 Dexterity Vest", 10, 20), //
				new TimeImprovedItem("Aged Brie", 2, 0), //
				new ClassicItem("Elixir of the Mongoose", 5, 7), //
				new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80), //
				new LegendaryItem("Sulfuras, Hand of Ragnaros", -1, 80),
				new QualitySellInLinkedItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new QualitySellInLinkedItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new QualitySellInLinkedItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				new ConjuredItem("Conjured Mana Cake", 3, 6) };

		GildedRose app = new GildedRose(items);

		int days = 30;
		if (args.length > 0) {
			days = Integer.parseInt(args[0]) + 1;
		}

		for (int i = 0; i < days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			for (Item item : items) {
				System.out.println(item);
			}
			System.out.println();
			app.updateQuality();
		}
	}

}
