import ru.ifmo.se.pokemon.*;
public class Porygon extends Pokemon {
    public Porygon(String name, int level){
        super(name, level);
        super.setType(Type.ROCK,Type.WATER);
        super.setStats(65, 60, 70, 85, 75,40);
        super.setMove(new  DoubleTeam(),new Swagger());

    }
}