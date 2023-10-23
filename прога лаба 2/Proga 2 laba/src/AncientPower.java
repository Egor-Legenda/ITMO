import ru.ifmo.se.pokemon.*;
public class AncientPower extends SpecialMove {

    public AncientPower(){
        super(Type.ROCK,60, 100);

    }
    @Override
    protected void applySelfEffects(Pokemon p){//атакующий покемон
        super.applySelfEffects(p);
        Effect c1=new Effect().stat(Stat.ATTACK,1);
        Effect c2=new Effect().stat(Stat.DEFENSE,1);
        Effect c3=new Effect().stat(Stat.SPECIAL_DEFENSE,1);
        Effect c4=new Effect().stat(Stat.SPEED,1);
        Effect c5=new Effect().stat(Stat.EVASION,1);
        Effect c6=new Effect().stat(Stat.ACCURACY,1);
        Effect c7=new Effect().stat(Stat.HP,1);
        if ((Main.chance(0.1))) {
            p.addEffect(c1);
            p.addEffect(c2);
            p.addEffect(c3);
            p.addEffect(c4);
            p.addEffect(c5);
            p.addEffect(c6);
            p.addEffect(c7);
            describe();
        }
    }
    // super(Type.FIRE,40, 100);
    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
    @Override
    protected java.lang.String describe() {
        return ("+1 ко всем показателям");
    }

}
