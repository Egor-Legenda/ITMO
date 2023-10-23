import ru.ifmo.se.pokemon.*;
import java.util.*;
public class DefenseCurl extends StatusMove {
    int count5=0;
    public DefenseCurl(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect c=new Effect().stat(Stat.DEFENSE,1);
        if (count5<6){
            count5+=1;
            p.addEffect(c);
            describe();
        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует восстановление брони Deferense Curl");
    }
}