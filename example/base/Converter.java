package Egor.example.base;
import Egor.example.exceptions.NullPointerException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import Egor.example.data.*;
import java.io.File;
import java.util.LinkedList;
import Egor.example.data.City;
import java.time.LocalDateTime;
import Egor.example.exceptions.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.Double;
public class Converter {
    private static final Gson Gson1 = new GsonBuilder().setPrettyPrinting().create();
    private static final Gson Gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter()).create();
    public String cityToJson(LinkedList<City> e){
        try {
            String json;
            json = Gson.toJson(e);
            return json;
        }catch (JsonSyntaxException E){
            System.out.println("Ошибка");
        }
        return "";
    }

    public LinkedList<City> cityFromJson(String e){
        LinkedList<City> dataList;
        try {
            dataList =Gson.fromJson(e, LinkedList.class);// данные с типом com.google.gson.internal.LinkedTreeMap

        }catch (com.google.gson.JsonSyntaxException E){
            return new LinkedList<City>();
        }
        LinkedList<City> cityList = new LinkedList<>();// список объектов типа City

        // Цикл для преобразования данных из LinkedTreeMap в объекты City
        for (Object obj : dataList) {
            LinkedTreeMap<String, Object> data = (LinkedTreeMap<String, Object>) obj;
            long id;
            try {
                try {
                    int g=0;
                    id = ((Number) (data.get("id"))).longValue(); //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
                    for (City cit:cityList){
                        if (cit.getId()==id){
                            g+=1;
                        }
                    }
                    if (id <= 0 || g>0) {
                        break;
                    }
                } catch (NullPointerException E) {
                    break;
                }
                String name;
                try {
                    name = (String) data.get("name"); //Поле не может быть null, Строка не может быть пустой
                } catch (NullPointerException E) {
                    break;
                }


                Object obje = data.get("coordinates");
                LinkedTreeMap<?, ?> map = (LinkedTreeMap<?, ?>) obje;
                Coordinates coordinates = new Coordinates(((Number) map.get("x")).longValue(), ((Number) map.get("y")).doubleValue());

                String dateString = (String) data.get("creationDate");
                LocalDateTime creationDate = LocalDateTime.parse(dateString);
                if (creationDate == null) {
                    break;
                }
                //Поле не может быть null, Значение этого поля должно генерироваться автоматически

                float area = ((Number) data.get("area")).floatValue(); //Значение поля должно быть больше 0, Поле не может быть null
                if (area <= 0) {
                    break;
                }
                long populati = ((Number) data.get("population")).longValue(); //Значение поля должно быть больше 0
                if (populati <= 0) {
                    break;
                }
                int metersAboveSeaLevel = ((Number) data.get("metersAboveSeaLevel")).intValue();
                boolean capital;
                try {
                    capital = (boolean) data.get("capital"); //Поле не может быть null
                } catch (NullPointerException E) {
                    break;
                }


                double populationDensity = (double) data.get("populationDensity"); //Значение поля должно быть больше 0
                if (populationDensity <= 0) {
                    break;
                }
                String climateData = (String) data.get("climate");
                Climate climate = Climate.valueOf(climateData.toUpperCase());//Поле не может быть null
                if (climate == null) {
                    break;
                }
                Object object = data.get("governor");
                LinkedTreeMap<?, ?> mapin = (LinkedTreeMap<?, ?>) object;
                Human governor = new Human(LocalDateTime.parse((String) mapin.get("birthday")));
                // Создание объекта City и добавление его в список cityList

                City city = new City(id, name, coordinates, creationDate, area, populati, metersAboveSeaLevel, capital, populationDensity, climate, governor);
                cityList.add(city);
            } catch (NumberFormatException | java.lang.ClassCastException r) {
                break;
            }
        }

        // Теперь список cityList содержит объекты типа City
        return cityList;
    }
}
