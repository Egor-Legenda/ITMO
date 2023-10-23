import ru.ifmo.se.pokemon.*;
public class PorygonZ extends Pokemon {
    public PorygonZ(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(85, 80, 70, 135, 75,90);
        super.setMove(new  DoubleTeam(),new Swagger(),new DefenseCurl(),new Rest());
    }
}