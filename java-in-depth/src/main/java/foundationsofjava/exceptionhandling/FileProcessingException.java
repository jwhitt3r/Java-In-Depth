package foundationsofjava.exceptionhandling;

public class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause){
        super(message, cause);
    }
}
