package Objects;

import enums.Actions;
import interfaces.Property;

public class They extends Alive implements Property {
    @Override
    public String toString() {
        return name;
    }

    static private String name;

    public They(String name){
        this.name=name;
    }

    public void Do(Actions act){
        if (act == Actions.PROMISED){
            System.out.print(name+" пообещали ");
        }
    }
    public void Do(Actions act, Beaver b, Obj o){
        Do(act);
        System.out.print(b);
        System.out.println(o);
    }
    @Override
    public void property(String proper){
        this.name =" "+ name +" "+proper;
    }
}
