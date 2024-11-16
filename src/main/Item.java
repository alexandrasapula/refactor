package main;

public class Item {
    private final Name name;
    private final SellIn sellIn;
    private final Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = new Name(name);
        this.sellIn = new SellIn(sellIn);
        this.quality = new Quality(quality);
    }

    public Name getName() {
        return name;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public Quality getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + quality;
    }
}
