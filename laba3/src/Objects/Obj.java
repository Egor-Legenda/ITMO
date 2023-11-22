package Objects;

import interfaces.Property;
import interfaces.TimeAction;

public class Obj implements Property, TimeAction {
    @Override
    public String toString() {
        return name;
    }
    private String name;
    public static String name1;
    private String name2;
    public Obj(String name){
        this.name=name;
        this.name2=name;
    }
    public void  act(Lesson l){
        this.name = (" "+name+" на "+l);
    }
    public void propertyNew(String proper){
        this.name2=" "+name2+" "+proper;
        this.name=name2;
        System.out.print(name);
    }
    @Override
    public void property(String proper){
        this.name=" "+name+" "+proper;
    }
    @Override
    public void time(String time){
        this.name=name+" "+time;
    }


}
