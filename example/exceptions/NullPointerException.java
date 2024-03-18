package Egor.example.exceptions;

public class NullPointerException extends RuntimeException {
    public NullPointerException(String massange){//При вводе 0
        super(massange);
    }
}
