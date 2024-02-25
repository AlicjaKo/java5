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

            switch (choice) {
                case 1:
                    //TODO: Implement the functionality
                    break;
                case 2:
                    //TODO: Implement the functionality
                    break;
                case 3:
                    //TODO: Implement the functionality
                    break;
                case 4:
                    //TODO: Implement the functionality
                    break;
                case 5:
                    //TODO: Implement the functionality
                    break;
                default:
                    break;
            }
        }
    }
}
