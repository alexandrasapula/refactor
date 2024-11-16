package test;

import main.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] {new RegularItem("foo", 0, 0)};
        GildedRose app = new GildedRose(Arrays.asList(items));
        app.updateQuality();
        assertEquals("fixme", app.getItems().get(0).getName());
    }
}
