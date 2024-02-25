package myapp;

import java.util.Scanner;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialMediaPlatform platform = new SocialMediaPlatform();
        boolean running = true;

        while (running) {
            System.out.println("Enter a command (addUser, removeUser, addFriend, removeFriend, viewFriends, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "addUser":
                    //TODO: Implement the functionality
                    break;
                case "removeUser":
                    //TODO: Implement the functionality
                    break;
                case "addFriend":
                    //TODO: Implement the functionality
                    break;
                case "removeFriend":
                    //TODO: Implement the functionality
                    break;
                case "viewFriends":
                    //TODO: Implement the functionality
                    break;
                case "exit":
                    //TODO: Implement the functionality
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
