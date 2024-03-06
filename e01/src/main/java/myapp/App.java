package myapp;

import java.util.Scanner;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        RetailStore retailStore = new RetailStore();

        boolean run = true;

        while (run) {
            System.out.println("Please select an option:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Update item");
            System.out.println("4. View items");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            Item i = new Item("Banana", 5, 2);

            retailStore.addItem(i);

            switch (choice) {
                case 1:
                    retailStore.addItem(i);
                    break;
                case 2:
                    retailStore.removeItem(i.getName());
                    break;
                case 3:
                    retailStore.updateItem("Apple", 1, 8);
                    break;
                case 4:
                    retailStore.viewItems();
                    break;
                case 5:
                    System.out.println("Thank you for visiting us :)");
                    break;
                default:
                    break;
            }
        }
    }
}
