import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    int count1=0;
    public EnergyBall(){
        super(Type.GRASS,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){//защищающийся покемон
        super.applyOppEffects(p);
        Effect n=new Effect().stat(Stat.SPECIAL_DEFENSE,-1);
        describe();
        if ((Main.chance(0.1)) && count1<6){
            p.addEffect(n);

        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует увеличение спец. брони Energy Ball");
    }
}
