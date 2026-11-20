package Move;

import ru.ifmo.se.pokemon.*;

public final class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1 && pokemon.getCondition() == Status.NORMAL
                && !pokemon.hasType(Type.FIRE)) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует FireBlast";
    }
}
