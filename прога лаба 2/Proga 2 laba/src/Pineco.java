import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.*;
public class Pineco extends Pokemon {
    public Pineco(String name, int level){
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(50, 65, 90, 35, 35,15);
        super.setMove(new IronDefense(),new DoubleTeam(),new RockSlide());

    }
}