package Move;

import ru.ifmo.se.pokemon.*;

public final class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3 && pokemon.getCondition() == Status.NORMAL
                && !pokemon.hasType(Type.POISON) && !pokemon.hasType(Type.STEEL)) {
            Effect.poison(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует PoisonJab";
    }
}
