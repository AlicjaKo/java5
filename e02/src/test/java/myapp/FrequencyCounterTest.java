package myapp;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyCounterTest {

    @Test
    void testFrequencyCounter() {
        int[] arr = { 1, 2, 3, 2, 1, 2, 4, 5, 3 };
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 3);
        expected.put(3, 2);
        expected.put(4, 1);
        expected.put(5, 1);

        Map<Integer, Integer> result = FrequencyCounter.getFrequencyMap(arr);

        assertEquals(expected, result);
    }
}
