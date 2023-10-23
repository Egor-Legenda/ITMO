import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK,75,90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){//защищающийся покемон
        super.applyOppEffects(p);
        if (Main.chance(0.30)) {
            Effect.flinch(p);
            describe();
        }
    }
    @Override
    protected java.lang.String describe() {
        return ("использует эффект вздрагивания Rock Slide");
    }
}
