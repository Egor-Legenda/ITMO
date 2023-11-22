package Objects;
import enums.*;
import interfaces.Property;

public class Beaver extends Alive implements Property {
    @Override
    public String toString() {
        return name;///Запись в виде String сделано, чтобы избавится от ошибки разных типов
    }

    static private String name;

    public Beaver(String name){
        this.name=name;///Обычное чтение имени и запись в переменную
    }

    public void Do(Actions act){
        if (act == Actions.REMOVE){/// От класса живых наследовался метод что-либо делать
            System.out.print(name+" сняла");/// проверка действий, если они сходятся то объект данного класса делает это действие, если нет то другое
        }
        if (act == Actions.BROUGHT_OUT){
            System.out.print(name+" вывели на глубину");
        }
    }
    public void Do(Actions act, Obj o){
        Do(act);///Вызваем тот метод в этом
        System.out.println(o);
    }
    @Override
    public void property(String proper){
        this.name = " "+name +" "+proper;/// добавление к имени свойства
    }
}
