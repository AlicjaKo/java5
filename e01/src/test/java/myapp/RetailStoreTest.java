package myapp;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RetailStoreTest {
    private RetailStore store;

    @BeforeEach
    void setUp() {
        store = new RetailStore();
    }

    @Test
    void addItem() {
        Item item = new Item("Shirt", 19.99, 10);
        store.addItem(item);
        assertTrue(store.getItems().contains(item));
    }

    @Test
    void removeItem() {
        Item item = new Item("Shirt", 19.99, 10);
        store.addItem(item);
        store.removeItem("Shirt");
        assertFalse(store.getItems().contains(item));
    }

    @Test
    void updateItem() {
        Item item = new Item("Shirt", 19.99, 10);
        store.addItem(item);
        store.updateItem("Shirt", 24.99, 5);
        assertEquals(24.99, store.getItems().get(0).getPrice(), 0.01);
        assertEquals(5, store.getItems().get(0).getQuantity());
    }

    @Test
    void viewItems() {
        Item item1 = new Item("Shirt", 19.99, 10);
        Item item2 = new Item("Pants", 29.99, 5);
        store.addItem(item1);
        store.addItem(item2);

        String expectedOutput = "Current items in store:\n" +
                "Shirt - Price: Eur 19.99 - Quantity: 10\n" +
                "Pants - Price: Eur 29.99 - Quantity: 5\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        store.viewItems();
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testGetItems() {
        RetailStore newStore = new RetailStore();
        Item item1 = new Item("Item 1", 10.0, 5);
        Item item2 = new Item("Item 2", 20.0, 10);
        newStore.addItem(item1);
        newStore.addItem(item2);

        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(new Item("Item 1", 10.0, 5));
        expectedItems.add(new Item("Item 2", 20.0, 10));

        List<Item> actualItems = newStore.getItems();
        assertEquals(expectedItems.size(), actualItems.size(), "Size of items list should match");
        for (int i = 0; i < expectedItems.size(); i++) {
            Item expectedItem = expectedItems.get(i);
            Item actualItem = actualItems.get(i);
            assertEquals(expectedItem.getName(), actualItem.getName(), "Item name should match");
            assertEquals(expectedItem.getPrice(), actualItem.getPrice(), "Item price should match");
            assertEquals(expectedItem.getQuantity(), actualItem.getQuantity(), "Item quantity should match");
        }
    }
}