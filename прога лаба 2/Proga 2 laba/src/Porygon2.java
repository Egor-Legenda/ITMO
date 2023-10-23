import ru.ifmo.se.pokemon.*;
public class Porygon2 extends Pokemon {
    public Porygon2(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(85, 80, 90, 105, 95,60);
        super.setMove(new  DoubleTeam(),new Swagger(),new DefenseCurl());

    }
}
