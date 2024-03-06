package myapp;

import java.util.HashSet;
import java.util.Set;

public class SocialMediaPlatform {
    private Set<User> users;

    public SocialMediaPlatform() {
        this.users = new HashSet<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean removeUser(User user) {
        users.remove(user);
        return (!users.contains(user));
    }

    public boolean addFriend(User user, User friend) {
        user.addFriend(friend);
        friend.addFriend(user);
        return (user.getFriends().contains(friend));
    }    

    public boolean removeFriend(User user, User friend) {
        user.removeFriend(friend);
        friend.removeFriend(user);
        return (!user.getFriends().contains(friend));
    }

    public void viewFriends(User user) {
       user.getFriends();
    }

    public Set<User> getUsers() {
        return users;
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; 
    }
    
}
