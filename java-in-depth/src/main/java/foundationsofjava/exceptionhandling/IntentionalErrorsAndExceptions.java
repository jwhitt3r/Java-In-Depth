package foundationsofjava.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class IntentionalErrorsAndExceptions {

    public static void main(String[] args) {
        // Intentional error: Missing semicolon
        System.out.println("Hello, World!");

        // Intentional runtime exception: Division by zero
        int result = divideByZero();
        System.out.println("Result: " + result);

        // Intentional checked exception: File not found
        readFile("nonexistentfile.txt");
    }

    public static int divideByZero() {
        // Intentional division by zero
        return 5 / 0;
    }

    public static void readFile(String filePath) {
        try {
            // Intentional file reading with potential IOException
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            // Handling the checked exception
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
