package Egor.example.base;

import Egor.example.exceptions.NullPointerException;

import java.util.Objects;
import java.util.Scanner;

public class ReadLine {
    public String read(){
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        return command;
    }
    public Integer readInt(){
        try {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            Integer command=0;
            command = Integer.valueOf(str);
            return command;

        } catch (NullPointerException E){
            System.out.println("Ввод осуществляется с помощью целых чисел: ");
            return readInt();

        } catch (Exception E) {
            System.out.println("Ввод осуществляется с помощью целых чисел: ");
            return readInt();
        }
    }
}
