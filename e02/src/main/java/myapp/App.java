package myapp;

import java.util.Map;

final class App {
    private App() {
        
    }

    public static void main(final String[] args) {
        int[] arr = { 8, 3, 1, 3, 6, 7, 10, 1, 8, 4, 2, 9, 6, 2, 6, 5, 9, 1, 10, 10};

        FrequencyCounter fc = new FrequencyCounter();

        fc.getFrequencyMap(arr);
        fc.displayFrequencies(fc.getFrequencyMap(arr));
    }
}
