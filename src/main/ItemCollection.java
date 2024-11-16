package main;

import java.util.List;

public class ItemCollection {
    private List<Item> items;

    public ItemCollection(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (isSulfuras(item)) continue;
            updateSellIn(item);
            updateQualityForItem(item);
            handleExpiredItem(item);
        }
    }

    private boolean isSulfuras(Item item) {
        return item.getName().getValue().equals("Sulfuras, Hand of Ragnaros");
    }

    private void updateSellIn(Item item) {
        item.getSellIn().decrement();
    }

    private void updateQualityForItem(Item item) {
        if (isAgedBrie(item)) {
            item.getQuality().increment();
            return;
        }
        if (isBackstagePass(item)) {
            updateBackstagePassQuality(item);
            return;
        }
        item.getQuality().decrement();
    }

    private void handleExpiredItem(Item item) {
        if (item.getSellIn().getValue() >= 0) return;
        if (isAgedBrie(item)) {
            item.getQuality().increment();
            return;
        }
        if (isBackstagePass(item)) {
            item.getQuality().setZero();
            return;
        }
        item.getQuality().decrement();
    }

    private boolean isAgedBrie(Item item) {
        return item.getName().getValue().equals("Aged Brie");
    }

    private boolean isBackstagePass(Item item) {
        return item.getName().getValue().equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private void updateBackstagePassQuality(Item item) {
        item.getQuality().increment();
        if (item.getSellIn().getValue() < 11) item.getQuality().increment();
        if (item.getSellIn().getValue() < 6) item.getQuality().increment();
    }

    public List<Item> getItems() {
        return items;
    }
}
