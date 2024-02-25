package myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    public void testGetName() {
        Item item = new Item("Item 1", 10.0, 5);
        Assertions.assertEquals("Item 1", item.getName());
    }

    @Test
    public void testGetPrice() {
        Item item = new Item("Item 1", 10.0, 5);
        Assertions.assertEquals(10.0, item.getPrice(), 0.001);
    }

    @Test
    public void testSetPrice() {
        Item item = new Item("Item 1", 10.0, 5);
        item.setPrice(15.0);
        Assertions.assertEquals(15.0, item.getPrice(), 0.001);
    }

    @Test
    public void testGetQuantity() {
        Item item = new Item("Item 1", 10.0, 5);
        Assertions.assertEquals(5, item.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        Item item = new Item("Item 1", 10.0, 5);
        item.setQuantity(10);
        Assertions.assertEquals(10, item.getQuantity());
    }
}
