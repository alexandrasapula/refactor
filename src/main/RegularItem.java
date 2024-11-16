package main;

public class RegularItem extends Item {
    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return getName() + ", " + getSellIn().getValue() + ", " + getQuality().getValue();
    }

    @Override
    public void updateItem() {
        getSellIn().decrement();
        getQuality().decrement();
        if (getSellIn().getValue() < 0) {
            getQuality().decrement();
        }
    }
}
