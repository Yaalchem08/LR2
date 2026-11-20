package Move;

import ru.ifmo.se.pokemon.*;

public final class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 0.8);
    }

    @Override
    protected double calcCriticalHit(Pokemon attacker, Pokemon defender) {
        return Math.random() < 1.0 / 8.0 ? 2.0 : 1.0;
    }

    @Override
    protected String describe() {
        return "использует StoneEdge";
    }
}
