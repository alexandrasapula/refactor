package main;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
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
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private void updateSellIn(Item item) {
        item.sellIn--;
    }

    private void updateQualityForItem(Item item) {
        if (isAgedBrie(item)) {
            increaseQuality(item);
        } else if (isBackstagePass(item)) {
            updateBackstagePassQuality(item);
        } else {
            decreaseQuality(item);
        }
    }

    private void handleExpiredItem(Item item) {
        if (item.sellIn >= 0) return;
        if (isAgedBrie(item)) {
            increaseQuality(item);
        } else if (isBackstagePass(item)) {
            item.quality = 0;
        } else {
            decreaseQuality(item);
        }
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) item.quality++;
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) item.quality--;
    }

    private void updateBackstagePassQuality(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) increaseQuality(item);
        if (item.sellIn < 6) increaseQuality(item);
    }

}