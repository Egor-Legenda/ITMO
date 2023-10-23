import ru.ifmo.se.pokemon.*;
public class Forretress extends Pokemon {
    public Forretress(String name, int level){
        super(name, level);
        super.setType(Type.BUG,Type.STEEL);
        super.setStats(75, 90, 140, 60, 60,40);
        super.setMove(new  IronDefense(),new DoubleTeam(),new RockSlide(), new RockPolish());

    }
}