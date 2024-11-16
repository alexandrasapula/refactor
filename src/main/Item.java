package main;

public abstract class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = new SellIn(sellIn);
        this.quality = new Quality(quality);
    }

    public String getName() {
        return name;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public Quality getQuality() {
        return quality;
    }

    public abstract void updateItem();

    public abstract String toString();
}
