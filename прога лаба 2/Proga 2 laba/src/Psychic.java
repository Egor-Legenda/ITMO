import ru.ifmo.se.pokemon.*;
public class Psychic extends SpecialMove {
    int count6=0;
    public Psychic(){
        super(Type.PSYCHIC,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){//защищающийся покемон
        super.applyOppEffects(p);
        Effect c =new Effect().stat(Stat.SPECIAL_DEFENSE,-1);
        describe();
        if (Main.chance(0.1) && count6<6) {
            p.addEffect(c);
            count6+=1;

        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует атаку Psychic");
    }
}