package myapp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

public class TestUtils {
    public static String getConsoleOutput(Consumer<Void> code) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        code.accept(null);
        return out.toString();
    }
}
