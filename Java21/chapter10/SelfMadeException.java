package chapter10;

public class SelfMadeException extends Exception{

    public SelfMadeException() {}

    public SelfMadeException(String message) {
        super(message);
    }
}
