import ru.ifmo.se.pokemon.*;

public class IceBeam extends PhysicalMove {
    public IceBeam(){
        super(Type.ICE,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){//эффект для цели
        super.applyOppEffects(p);
        if (Main.chance(0.1)) {
            Effect.freeze(p);
            describe();
        }
    }
    @Override
    protected java.lang.String describe() {
        return "Заморозил";
    }

}
