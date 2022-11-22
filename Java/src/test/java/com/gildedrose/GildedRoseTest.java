package com.gildedrose;

import org.junit.jupiter.api.Test;

import com.gildedrose.items.AbstractExpireableItem;
import com.gildedrose.items.ClassicItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        AbstractExpireableItem[] items = new AbstractExpireableItem[] { new ClassicItem("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems().get(0).name);
    }
    
    

}
