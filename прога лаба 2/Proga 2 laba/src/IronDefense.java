import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {
    int count2=0;
    public IronDefense(){
        super(Type.STEEL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){//атакующий покемон
        super.applySelfEffects(p);
        Effect c=new Effect().stat(Stat.DEFENSE,2);
        if ((Main.chance(0.5))&& (count2<3)) {
            p.addEffect(c);
            count2+=1;
            describe();
        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует увеличение спец. брони Iron Defense");
    }
}