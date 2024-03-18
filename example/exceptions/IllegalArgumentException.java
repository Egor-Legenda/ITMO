package Egor.example.exceptions;

public class IllegalArgumentException extends RuntimeException{
    private String massange;
    public IllegalArgumentException(String massange){
        super(massange);
        this.massange=massange;
    }

    @Override
    public String toString() {
        return massange;
    }
}
