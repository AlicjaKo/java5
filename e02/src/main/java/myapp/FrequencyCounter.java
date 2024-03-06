package myapp;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    
    public static Map<Integer, Integer> getFrequencyMap(int[] arr) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i : arr) {
            hMap.put(i, hMap.getOrDefault(i, 0) + 1);
        }

        return hMap;
    }

    public static void displayFrequencies(Map<Integer, Integer> frequencyMap) {
        System.out.println(frequencyMap);
    }
}