package myapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SocialMediaPlatformTest {

    private SocialMediaPlatform socialMediaPlatform;
    private User alice;
    private User bob;
    private User charlie;

    @BeforeEach
    void setUp() {
        socialMediaPlatform = new SocialMediaPlatform();
        alice = new User("alice");
        bob = new User("bob");
        charlie = new User("charlie");
    }

    @Test
    void testAddUser() {
        socialMediaPlatform.addUser(alice);
        assertTrue(socialMediaPlatform.getUsers().contains(alice));
    }

    @Test
    void testRemoveUser() {
        socialMediaPlatform.addUser(alice);
        assertTrue(socialMediaPlatform.removeUser(alice));
        assertFalse(socialMediaPlatform.getUsers().contains(alice));
    }

    @Test
    void testAddFriend() {
        socialMediaPlatform.addUser(alice);
        socialMediaPlatform.addUser(bob);
        assertTrue(socialMediaPlatform.addFriend(alice, bob));
        assertTrue(alice.getFriends().contains(bob));
        assertTrue(bob.getFriends().contains(alice));
    }

    @Test
    void testRemoveFriend() {
        socialMediaPlatform.addUser(alice);
        socialMediaPlatform.addUser(bob);
        socialMediaPlatform.addFriend(alice, bob);
        assertTrue(socialMediaPlatform.removeFriend(alice, bob));
        assertFalse(alice.getFriends().contains(bob));
        assertFalse(bob.getFriends().contains(alice));
    }

    @Test
    void testViewFriends() {
        socialMediaPlatform.addUser(alice);
        socialMediaPlatform.addUser(bob);
        socialMediaPlatform.addUser(charlie);
        socialMediaPlatform.addFriend(alice, bob);
        socialMediaPlatform.addFriend(alice, charlie);
        socialMediaPlatform.viewFriends(alice);
        // check that alice has bob and charlie as friends
        assertTrue(alice.getFriends().contains(bob));
        assertTrue(alice.getFriends().contains(charlie));
    }

    @Test
    void testGetUserByUsername() {
        socialMediaPlatform.addUser(alice);
        socialMediaPlatform.addUser(bob);
        socialMediaPlatform.addUser(charlie);
        assertEquals(alice, socialMediaPlatform.getUserByUsername("alice"));
        assertEquals(bob, socialMediaPlatform.getUserByUsername("bob"));
        assertEquals(charlie, socialMediaPlatform.getUserByUsername("charlie"));
    }

}
