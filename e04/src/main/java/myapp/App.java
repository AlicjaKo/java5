package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Integer, Integer> pair2 = new Pair<>(1, 1);
        Pair<String, String> pair3 = new Pair<>("One", "Two");

        System.out.println("pair1 equals pair2: " + pair1.equals(pair2)); 
        System.out.println("pair1 equals pair3: " + pair1.equals(pair3)); 

    }
}
