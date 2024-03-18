package Egor.example.exceptions;

public class JsonSyntaxException extends RuntimeException{
    public JsonSyntaxException(String massange){
        super(massange);
    }
}
