package Egor.example;
import Egor.example.base.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        for (String arg: args){
            Controller.str=Controller.str +arg;
        }
        Controller.str ="C:/Users/eshuk/OneDrive/Рабочий стол/лабы/прога/лаба 5.1/City.json";
        if (Controller.str.equals("")){
            System.out.println("Файл не был введен");
            System.exit(0);
        }
        try {
            File file =new File(Controller.str);
            Scanner scan = new Scanner(file);
        }catch (FileNotFoundException E){
            System.out.println("Файл не найден программа завершена");
            System.exit(0);
        }
        Controller control =new Controller();
        System.out.println(Controller.str);
        control.run();
    }
}
//..\..\..\City.json
//C:/Users/eshuk/OneDrive/Рабочий стол/лабы/прога/лаба 5.1/City.json
//execuite_script C:/Users/eshuk/OneDrive/Рабочий стол/лабы/прога/лаба 5.1/yrt.txt
//C:\Users\eshuk\OneDrive\Рабочий стол\лабы\прога\лаба 5.1\City.json
//
