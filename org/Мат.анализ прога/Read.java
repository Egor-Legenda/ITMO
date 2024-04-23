package org.example;

import java.util.Scanner;

public class Read {
    public Double read(String line){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите новое значение для "+line);
        try {
            return Double.parseDouble(scan.nextLine().trim());
        }catch (NumberFormatException e){
            System.out.println("Неправильный ввод.");
            return read(line);
        }


    }
}
