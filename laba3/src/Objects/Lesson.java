package Objects;

import interfaces.*;

public class Lesson implements Property, TimeAction {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Lesson(String name) {
        this.name = name;
    }
    public void  act(Obj l){
        this.name = (name+" в"+l);
    }

    @Override
    public void property(String proper) {
        this.name = " " + name + " " + proper;
    }

    @Override
    public void time(String time) {
        this.name = name + " " + time;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = PRIME;
        result = PRIME * name.hashCode() + result;
        return result;
    }
}
