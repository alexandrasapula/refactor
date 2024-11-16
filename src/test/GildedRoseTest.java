package test;

import main.GildedRose;
import main.Item;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(Arrays.asList(items));
        app.updateQuality();
        assertEquals("fixme", app.getItems().get(0).getName());
    }
}
