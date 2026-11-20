package Move;

import ru.ifmo.se.pokemon.*;

public final class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 1.0);
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        double damage = super.calcBaseDamage(attacker, defender);
        if (defender.getCondition() == Status.POISON) {
            return damage * 2;
        }
        return damage;
    }

    @Override
    protected String describe() {
        return "использует Venoshock";
    }
}
