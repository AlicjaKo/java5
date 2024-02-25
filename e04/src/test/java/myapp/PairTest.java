package myapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PairTest {

    @Test
    public void testPairConstructorAndGetters() {
        Pair<String, Integer> pair = new Pair<>("Test", 123);
        assertEquals("Test", pair.getFirst(), "First element should be 'Test'");
        assertEquals(123, pair.getSecond(), "Second element should be 123");
    }

    @Test
    public void testPairEqualityWithEqualPairs() {
        Pair<String, Integer> pair1 = new Pair<>("Test", 123);
        Pair<String, Integer> pair2 = new Pair<>("Test", 123);

        assertTrue(pair1.equals(pair2), "Pairs should be equal");
    }

    @Test
    public void testPairEqualityWithDifferentPairs() {
        Pair<String, Integer> pair1 = new Pair<>("Test", 123);
        Pair<String, Integer> pair2 = new Pair<>("Another Test", 123);
        Pair<String, Integer> pair3 = new Pair<>("Test", 456);

        assertFalse(pair1.equals(pair2), "Pairs with different first elements should not be equal");
        assertFalse(pair1.equals(pair3), "Pairs with different second elements should not be equal");
    }

    @Test
    public void testPairEqualityWithNull() {
        Pair<String, Integer> pair = new Pair<>("Test", 123);

        assertFalse(pair.equals(null), "Pair should not be equal to null");
    }

    @Test
    public void testPairEqualityWithItself() {
        Pair<String, Integer> pair = new Pair<>("Test", 123);

        assertTrue(pair.equals(pair), "Pair should be equal to itself");
    }
}
