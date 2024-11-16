package main;

public class BackstagePassItem extends Item {
    public BackstagePassItem(String name, int sellIn, int quality) {
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
        if (getSellIn().getValue() < 11) {
            getQuality().increment();
        }
        if (getSellIn().getValue() < 6) {
            getQuality().increment();
        }
        if (getSellIn().getValue() < 0) {
            getQuality().setZero();
        }
    }
}
