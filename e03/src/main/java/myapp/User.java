package myapp;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private String username;
    private Set<User> friends;

    public User(String username) {
        this.username = username;
        this.friends = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }


}
