// ItemCollection.java
package main;

import java.util.List;

public class ItemCollection {
    private List<Item> items;

    public ItemCollection(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateItem();
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
