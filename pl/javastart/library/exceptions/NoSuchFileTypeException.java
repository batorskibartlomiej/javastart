package pl.javastart.library.exceptions;

public class NoSuchFileTypeException extends RuntimeException {
    public NoSuchFileTypeException(String msg) {
        super(msg);
    }
}
