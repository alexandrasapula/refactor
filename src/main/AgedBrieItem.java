package main;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return getName() + ", " + getSellIn().getValue() + ", " + getQuality().getValue();
    }

    @Override
    public void updateItem() {
        getSellIn().decrement();
        getQuality().increment();
        if (getSellIn().getValue() < 0) {
            getQuality().increment();
        }
    }
}
