package foundationsofjava.exceptionhandling;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IntentionalErrorsAndExceptionsTest {

    @Test
    public void testDivisionByZero() {
        // Verify that an ArithmeticException is thrown
        assertThrows(ArithmeticException.class, IntentionalErrorsAndExceptions::divideByZero);
    }

    @Test
    public void testFileNotFound() {
        // Redirect standard error stream for assertions
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        // Attempt to read from a nonexistent file
        IntentionalErrorsAndExceptions.readFile("nonexistentfile.txt");

        // Verify the output contains the error message
        assertTrue(errContent.toString().contains("IOException"));

        // Reset stream
        System.setErr(System.err);
    }
}