import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    int count3=0;
    public  DoubleTeam(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){//атакующий покемон
        super.applySelfEffects(p);
        Effect c=new Effect().stat(Stat.EVASION,2);
        if ((Main.chance(0.5))&& (count3<6)) {
            p.addEffect(c);
            count3+=1;
            describe();
        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует увеличение ловкости Double Team");
    }
}