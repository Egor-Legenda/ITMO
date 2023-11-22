package Objects;
import interfaces.*;
public class Thing implements Property, Benefit, TimeAction {
    private String name;
    public Thing(String name){
        this.name=name;
    }
    @Override
    public void property(String proper){
        this.name = " "+name +" "+proper;
    }
    @Override
    public void benefit(String ben){
        this.name=name+" "+ben;
    }
    @Override
    public void time(String time){
        this.name=name+" "+time;
        System.out.println(this.name);
    }
}
