import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove {
    public Rest() { super(Type.PSYCHIC,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        double n= p.getHP();
        int m=(int) n;
        m=85-m;
        Effect c=new Effect().stat(Stat.HP,m);
        Effect e = new Effect().condition(Status.SLEEP).turns((int) 2);
        p.addEffect(e);
        p.addEffect(c);
        describe();
    }
    @Override
    protected java.lang.String describe() {
        return ("использует атаку Rest");
    }
}
