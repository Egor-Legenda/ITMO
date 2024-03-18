package Egor.example.base;
import Egor.example.exceptions.FileNotFoundException;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
public class WorkFile {
    private String json="";
    private ReadLine readerline =new ReadLine();
    CommandControl control = new CommandControl();
    private int count=0;
    public String reader(String name){
        try {
            count=0;
            File file =new File(name);
            Scanner scan = new Scanner(file);//
            while (scan.hasNextLine()) {
                count+=1;
                json = json + scan.nextLine()+"\n";
            }
            CommandControl.inputData=name;
            CommandControl.length =count;
            System.out.println("Файл найден");
            scan.close();
        }catch (java.io.FileNotFoundException E){
            System.out.println("Файл не найден введите введите новый черз / ");
            reader(control.reader());
        }
        return json;
    }
    public void writer(String path,String json) { //Запись в файл
        File file = new File(path);
        try (OutputStream out = new FileOutputStream(file)) {
            byte[] js = json.getBytes();// Перевод в байт код
            out.write(js);
            out.close();//Необязательно
            System.out.println("Загружено");
        } catch (java.io.FileNotFoundException E) { // Нет файла
            System.out.println("Файл не найден для записи введите новый черз /");
            writer(readerline.read(), json);

        } catch (IOException e) {// Ошибка доступа к файлу и ее обработка
            System.out.println("Файл недоступен для записи введите новый черз / или измините права доступа\n");
            writer(readerline.read(), json);
        }
    }
    public ArrayList<String> readerArray(String name){////
        String[] js;
        ArrayList<String> list=null;
        try {
            File file = new File(name);
            Scanner scan = new Scanner(file);//
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
            scan.close();
            return list;
        }catch (java.io.FileNotFoundException E){
            System.out.println("Файл не найден введите введите новый черз / ");
            return readerArray(readerline.read());
        }

    }


}
