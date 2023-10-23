import ru.ifmo.se.pokemon.*;
public class RockPolish extends StatusMove {
    int count4=0;
    public RockPolish(){
        super(Type.ROCK,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {//атакующий покемон
        super.applySelfEffects(p);
        Effect c = new Effect().stat(Stat.SPEED, 2);
        if ((count4 < 3)) {
            p.addEffect(c);
            count4 += 1;
            describe();
        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует увеличение скорости Rock Polish");
    }
}