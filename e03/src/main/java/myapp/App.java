package myapp;
import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialMediaPlatform platform = new SocialMediaPlatform();
        boolean running = true;
        User u = new User("Sam");

        while (running) {
            System.out.println("Enter a command (addUser, removeUser, addFriend, removeFriend, viewFriends, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "addUser":
                    platform.addUser(u);
                    break;
                case "removeUser":
                    platform.removeUser(u);
                    break;
                case "addFriend":
                    platform.addFriend(u, u);
                    break;
                case "removeFriend":
                    platform.removeFriend(u, u);
                    break;
                case "viewFriends":
                    platform.viewFriends(u);
                    break;
                case "exit":
                    System.out.println("Thank you for visiting uor platform!");
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
