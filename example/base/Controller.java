package Egor.example.base;

import java.util.ConcurrentModificationException;
import Egor.example.commandIn.*;
import Egor.example.exceptions.IllegalArgumentException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    private String js = "";
    private int i = 1;
    //private static final Gson Gson = new GsonBuilder().setPrettyPrinting().create();
    CommandControl control =new CommandControl();
    public static String str ="";
    Converter converter =new Converter();
    ReadLine readLine =new ReadLine();
    public void createCommand(){
        control.addCommand("help",new Help());
        control.addCommand("exit",new Exit());
        control.addCommand("info",new Info());
        control.addCommand("show",new Show());
        control.addCommand("clear",new Clear());
        control.addCommand("min_by_capital",new MinByCapital());
        control.addCommand("save",new Save());
        control.addCommand("remove_head",new RemoveHead());
        control.addCommand("head",new Head());
        control.addCommand("count_less_than_climate",new CountLessThanClimate());
        control.addCommand("filter_starts_with_name",new FilterStartsWithName());
        control.addCommand("remove_by_id",new RemoveById());
        control.addCommand("execute_script",new ExecuiteScript());
        control.addCommand("add",new Add());
        control.addCommand("add_if_max",new AddIfMax());
        control.addCommand("update",new Update());
    }
    public void run() throws FileNotFoundException {
        createCommand();
        WorkFile file = new WorkFile();
        String tip =file.reader(str);
        CollectionManager.cities =(converter.cityFromJson(tip));
        Scanner scanner =new Scanner(System.in);
        //System.out.println("Введите название файла:");
        while (scanner.hasNextLine()) {
            CollectionManager manager =new CollectionManager();
            if (i==0){
                /*String command = scanner.nextLine();
                String str =file.reader(command);
                CollectionManager.cities =(converter.cityFromJson(str));*/
                i+=1;
            }else {

                String command = scanner.nextLine().trim();

                // Разделяем строку по пробелам
                String[] argument = command.split("\\s+");
                ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(argument));
                String[] words=new String[0];
                String line="";
                int danger=0;
                int in=0;
                try{
                    for(String str: arrayList){
                        if ((str.equals(" ") || str.equals(""))&&(danger==0)){
                            if (str.equals(" ")){
                                arrayList.remove(in);
                            }
                            if (str.equals("")){
                                arrayList.remove(in);
                            }
                        }else {
                            danger+=1;
                        }
                        in+=1;

                    }
                    words = arrayList.toArray(new String[0]);
                    if (words.length > 1) {
                        // Получаем первое слово
                        command = words[0];
                        String firstWord=words[0];

                        // Удаляем пробелы перед следующими словами
                        StringBuilder result = new StringBuilder("");
                        for (int i = 1; i < words.length; i++) {
                            result.append(words[i]);
                            line = line + " " + words[i];
                        }

                        // Выводим результат
                        line=line.trim();
                    }else {
                        command=words[0];
                    }
                }catch (java.util.ConcurrentModificationException У){

                }

                //String command = scanner.nextLine();
                //WorkFile file = new WorkFile();
                command =command.toLowerCase();
                switch (command) {
                    case "info","help","exit","show","clear","save","head","remove_head","min_by_capital":
                        if (words.length==1){
                            System.out.println(control.getCommand(command).execution(command));
                        }else {
                            System.out.println("Данная команда вводится без аргумента");
                        }

                        break;
                    case "count_less_than_climate","filter_starts_with_name","remove_by_id","update":
                        System.out.println(control.getCommand(command).execution(line));
                        break;
                    case "add_if_max","add":
                        if (words.length==1){
                            System.out.println(control.getCommand(command).execution(line));
                        }else {
                            System.out.println("Данная команда вводится без аргумента");
                        }
                        break;

                    case "execute_script":
                        System.out.println(control.getCommand(command).execution(line));
                        break;
                    default:
                        System.out.println(new IllegalArgumentException("Неизвестная команда: " + command));
                        break;
                }
            }
        }
    }
}
