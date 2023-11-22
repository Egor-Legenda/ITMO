import Objects.*;
import enums.*;
public class Main {
    public static void main(String[] args) {
        Obj Theater = new Obj("театр");
        Theater.property("стоящий на мели");
        They They=new They("Они");
        They.property("смышленые");
        Beaver Ber = new Beaver("Команда бобров");
        Obj ticket = new Obj("билет");
        Lesson Premiere =new Lesson("премьера");
        Premiere.time("завтрашняя");
        Premiere.act(Theater);
        ticket.act(Premiere);
        ///Билет на объект премьеру реализовать+++
        ///Репетиция и премьера в театре+++
        ///сцена свойства у театра+++
        Obj Scene = new Obj("Сцена");
        Scene.property("криво стоит");
        Scene.time("теперь");
        Lesson Repetition=new Lesson("Репетиция");
        Repetition.property("пьесы Муми-папы шла");
        Repetition.act(Theater);
        Repetition.time("сегодня");
        Lesson piece =new Lesson("Пьеса");
        piece.act(Theater);
        piece.property("будет");
        piece.time("завтра");
        Thing lamp=new Thing("Лампы");
        lamp.property("ярко");
        lamp.benefit("горели");
        System.out.println(Repetition);
        lamp.time("днем");
        They.Do(Actions.PROMISED,Ber,ticket);
        System.out.println(piece);
        Ber.property("умная");
        Ber.Do(Actions.REMOVE,Theater);
        Ber.Do(Actions.BROUGHT_OUT,Theater);
        Theater.propertyNew("на глубине");
        System.out.println(Scene);
    }

}