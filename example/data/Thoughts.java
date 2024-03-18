package Egor.example.data;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.LinkedList;

public class Thoughts {
            /*Coordinates coor = new Coordinates(1L, 2.0);
        Human hum =new Human("1970/01/01");
        City city1 =new City(1,"м",coor, "-999999999-01-01T00:00:00",1,2,3,true,3, Climate.DESERT,hum);
        City city0 =new City(1,"м",coor, "-999999999-01-01T00:00:00",1,2,3,true,3, Climate.DESERT,hum);
        LinkedList<City> list = new LinkedList<>();
        list.add(city1);
        list.add(city0);// создаем лист , который потом переделываем в json
        String json = Gson.toJson(list);
        System.out.println(json);//Выводим json для проверки
        LinkedList<City> list1 =Gson.fromJson(json, LinkedList.class);// В лист запись json файла
        System.out.println(list1);// Выводим его
        String separator = File.separator; // Создаем сепаратор он нужен для определения / или \
        String path =separator + "Users"+separator +"eshuk"+separator +"OneDrive"+separator +"Рабочий стол"+separator +"лабы"+separator +"прога"+separator +"лаба 5.1"+separator +"City.json";
        File file =new File(path);// Создаем файл с путем path
        Scanner scan =new Scanner(file);//
        while (scan.hasNextLine()){
            js =js + scan.nextLine()+"\n";
        }
        //System.out.println(js);
        City city3 =Gson.fromJson(js, City.class);
        System.out.println(city3);
        scan.close();*/
            /*LocalDateTime local = LocalDateTime.of(1956, Month.MAY,19,19,0,1);
    LocalDateTime local1 = LocalDateTime.of(1958,Month.JUNE,21,18,0,1);
    LocalDateTime local2 = LocalDateTime.of(1147,Month.APRIL,4,12,13,1);
    LocalDateTime local3 = LocalDateTime.of(1703, Month.APRIL,27,11,17,1);*/
        /*try {
//            File file = new File("./././City.json");
//            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (FileNotFoundException E){
            System.out.println("Файл не найден");
        }*/
            /*Coordinates coor = new Coordinates(55L, 37.0);
    Coordinates coor1 = new Coordinates(59L, 30.19);
    Human hum =new Human(local);
    Human hum1 =new Human(local1);
    City city1 =new City(0,"Moscow",coor, local2,2511,12700000,124,true,5116, Climate.DESERT,hum1);
    City city0 =new City(1,"Saint-Petersburg",coor1, local3,1439,5500000,3,true,3991, Climate.DESERT,hum);
    LinkedList<City> list = new LinkedList<>();
        System.out.println(local);
        list.add(city1);
        list.add(city0);// создаем лист , который потом переделываем в json
    //String json = Gson.toJson(list);
    String json = converter.cityToJson(list);
        System.out.println(json);
        file.writer("C:/Users/eshuk/OneDrive/Рабочий стол/лабы/прога/лаба 5.1/City.json",json);*/
}
