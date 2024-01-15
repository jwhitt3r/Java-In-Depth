# Week [1]: [OOP]

## Key Concepts

- **Objectives:** Briefly list the main learning objectives for the week.

- **Core Concepts:**
    - List the core concepts covered during the week.
    - Use bullet points for clarity.

## Hands-On Practice

- **Code Snippets:**
 
Checked Exceptions
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Reading from a file that may not exist
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            // Handle the checked exception
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
```

Error Exception
```java
public class ErrorExample {
    public static void main(String[] args) {
        try {
            // Simulating a stack overflow error
            recursiveMethod();
        } catch (StackOverflowError e) {
            // This is not a recommended practice for errors
            System.err.println("StackOverflowError: " + e.getMessage());
        }
    }

    private static void recursiveMethod() {
        recursiveMethod();
    }
}
```

Runtime Exception
```java
public class RuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulating a runtime exception (division by zero)
            int result = divideByZero();
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle the runtime exception
            System.err.println("ArithmeticException: " + e.getMessage());
        }
    }

    private static int divideByZero() {
        return 5 / 0;
    }
}
```
Exception Translation
* Scenario: You're interacting with a lower-level API, like file I/O or database access, and you want to provide higher-level, more meaningful exceptions to the clients of your code.
* Implementation: Catch a lower-level exception (e.g., IOException) and throw a custom exception that provides additional context or abstraction (e.g., FileReadException).
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader {

    public String readFile(String filePath) throws FileReadException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (IOException e) {
            // Translate the lower-level IOException into a higher-level FileReadException
            throw new FileReadException("Error reading file: " + filePath, e);
        }
    }
}
```
Exception Chaining

* Scenario: An exception occurs within your application, and you want to provide additional details about the failure while preserving the original exception for debugging or logging purposes.
* Implementation: Catch the original exception, create a new custom exception (e.g., CustomApplicationException), and set the original exception as its cause using the constructor (new CustomApplicationException("Additional details", originalException)).
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChainingExample {

    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (FileProcessingException e) {
            // Handle the top-level exception
            System.err.println("Error processing file: " + e.getMessage());
            // Access the chained exception for more details
            System.err.println("Original cause: " + e.getCause().getMessage());
        }
    }

    public static void processFile(String filePath) throws FileProcessingException {
        try {
            readFile(filePath);
            // Perform some processing
            // ...
        } catch (IOException e) {
            // Wrap the caught IOException in a custom exception
            throw new FileProcessingException("Error processing file", e);
        }
    }

    public static void readFile(String filePath) throws IOException {
        // Read from the file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        // Simulate an IOException during reading
        throw new IOException("IO error while reading the file");
    }

    // Custom exception for file processing
    static class FileProcessingException extends Exception {
        public FileProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
```

- **Projects:**
    - The key topic for this week is exceptional event handling, which is broken down into three areas:
      - Exception Handling in Java
      - Exception Translation
      - Exception Chaining

## Challenges and Solutions

- **Challenges:**
    - The week was slightly lighter on material so staying focused was challenging

- **Solutions:**
    - Used the time to carefully read the material and take time to get more elaxed about the project

## Reflection

- **What Went Well:**
    - Good understanding and broke the topic over a longer period of time allowed for a better understanding

- **Areas for Improvement:**
    - N/A

## Additional Resources

- **Reading Materials:**
    - N/A

- **Video Tutorials:**
    - N/A

## Future Focus

- **Key Takeaways:**
    - The key element is understanding where the code should be wrapped and how it should be wrapped. To my understanding code within a package that could cause an exceptional event should provide a `throws` line to the method signature and anything calling it will need to be wrapped in a try catch

- **Next Steps:**
    - Utilise the material into the Mini library project

## Personal Notes

- **Personal Observations:**
    - N/A

- **Questions:**
    - When would I use exception chaining and how deep do you go?

## Review

- **Review Date:**
    - 14/01/2024
