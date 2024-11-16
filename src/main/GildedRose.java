package main;

import java.util.List;

public class GildedRose {
    private ItemCollection itemCollection;

    public GildedRose(List<Item> items) {
        this.itemCollection = new ItemCollection(items);
    }

    public void updateQuality() {
        itemCollection.updateQuality();
    }

    public List<Item> getItems() {
        return itemCollection.getItems();
    }
}
