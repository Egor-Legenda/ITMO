package Egor.example.exceptions;

public class NoSuchElementException extends RuntimeException{
    public NoSuchElementException(String massange){//При вводе 0
        super(massange);
    }
}
