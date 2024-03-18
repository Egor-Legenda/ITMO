package Egor.example.exceptions;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(String massange){
        super(massange);
    }
}
