package myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class UserTest {
    private User user;
    private User friend1;
    private User friend2;

    @BeforeEach
    void setUp() {
        user = new User("user");
        friend1 = new User("friend1");
        friend2 = new User("friend2");
    }

    @Test
    void testGetUsername() {
        Assertions.assertEquals("user", user.getUsername());
    }

    @Test
    void testGetFriends() {
        Set<User> friends = user.getFriends();
        Assertions.assertNotNull(friends);
        Assertions.assertTrue(friends.isEmpty());
    }

    @Test
    void testAddFriend() {
        user.addFriend(friend1);
        Set<User> friends = user.getFriends();
        Assertions.assertEquals(1, friends.size());
        Assertions.assertTrue(friends.contains(friend1));
    }

    @Test
    void testRemoveFriend() {
        user.addFriend(friend1);
        user.addFriend(friend2);
        user.removeFriend(friend1);
        Set<User> friends = user.getFriends();
        Assertions.assertEquals(1, friends.size());
        Assertions.assertTrue(friends.contains(friend2));
        Assertions.assertFalse(friends.contains(friend1));
    }
}
