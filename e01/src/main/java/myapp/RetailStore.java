package myapp;

import java.util.ArrayList;
import java.util.List;

public class RetailStore {
    private List<Item> items;

    public RetailStore() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        for (Item i : items) {
            if (i.getName().equals(itemName)) {
                items.remove(i);
                break;
            }
        }
    }

    public void updateItem(String itemName, double newPrice, int newQuantity) {
        Item b = new Item(itemName, newPrice, newQuantity);
        for (int i = 0; i < items.size(); i++) {
            Item currentItem = items.get(i);
            if (currentItem.getName().equals(itemName)) {
                items.set(i, b);
                break;
            }
        }
    }

    public void viewItems() {
        System.out.println("Current items in store:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
    

    public List<Item> getItems(){
        return items;
    }
}
