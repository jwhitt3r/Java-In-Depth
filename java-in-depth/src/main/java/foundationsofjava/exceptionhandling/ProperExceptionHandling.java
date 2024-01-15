package foundationsofjava.exceptionhandling;

import java.io.IOException;

/**
 * This class illustrates proper exception handling practices in Java.
 * It demonstrates a simple scenario involving file processing, where various methods
 * are used to perform operations, and exceptions are appropriately handled.
 *
 * The main method ({@code main}) serves as the entry point and invokes the {@code processFile}
 * method, catching and rethrowing any {@code FileProcessingException} as an unchecked {@code RuntimeException}.
 *
 * The {@code processFile} method is responsible for calling the {@code readFile} method,
 * catching any {@code IOException} that might occur during file processing, and rethrowing it
 * as a checked {@code FileProcessingException}.
 *
 * The {@code readFile} method intentionally throws an {@code IOException} to simulate a scenario
 * where file reading encounters an issue.
 *
 * By adhering to this structure, the code emphasizes proper exception handling, distinguishing
 * between checked and unchecked exceptions, and provides a clear pathway for handling file-related issues.
 *
 * @author jwhitter
 * @version 1.0
 */
public class ProperExceptionHandling {

    /**
     * The main entry point of the program. Invokes the {@code processFile} method
     * and rethrows any {@code FileProcessingException} as an unchecked {@code RuntimeException}.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args){
        try {
            processFile();
        } catch (FileProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Performs file processing by calling the {@code readFile} method.
     * Catches any {@code IOException} during the process and rethrows it
     * as a checked {@code FileProcessingException}.
     *
     * @throws FileProcessingException If an issue occurs during file processing.
     */
    public static void processFile() throws FileProcessingException {
        try {
            readFile();
        } catch (IOException e) {
            throw new FileProcessingException("Error processing file", e);
        }
    }

    /**
     * Simulates reading from a file and intentionally throws an {@code IOException}
     * to represent a scenario where file reading encounters an issue.
     *
     * @throws IOException Simulated exception during file reading.
     */
    public static void readFile() throws IOException {
        throw new IOException("Simulated IO error during file reading");
    }

    /**
     * Custom checked exception for file processing issues.
     */
    static class FileProcessingException extends Exception {

        /**
         * Constructs a {@code FileProcessingException} with the specified detail message
         * and the original cause of the exception.
         *
         * @param message Detail message explaining the exception.
         * @param cause Original cause of the exception.
         */
        public FileProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}