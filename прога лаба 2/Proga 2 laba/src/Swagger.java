import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    int count=0;
    public Swagger(){
        super(Type.NORMAL,0,85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){//защищающийся покемон
        super.applyOppEffects(p);
        describe();
        if (Main.chance(0.33)) {
            Effect.confuse(p);
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p){//атакующий покемон
        super.applySelfEffects(p);
        Effect c=new Effect().stat(Stat.ATTACK,2);
        if ((Main.chance(0.5)) && (count<3)) {
            p.addEffect(c);
            count+=1;
        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует атаку Swagger");
    }
}