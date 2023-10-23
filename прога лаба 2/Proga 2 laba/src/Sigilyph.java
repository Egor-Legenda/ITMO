import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sigilyph extends Pokemon {
    public Sigilyph(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC,Type.FLYING);
        super.setStats(72, 58, 80, 103, 80,97);
        super.setMove(new Psychic(),new IceBeam(),new EnergyBall(),new AncientPower() );

    }
}
