package Move;

import ru.ifmo.se.pokemon.*;

public final class Magnitude extends PhysicalMove {
    public Magnitude() {
        super(Type.GROUND, 70, 1.0);
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
        double chance = Math.random();
        if (chance < 0.05) {
            power = 10;
        } else if (chance < 0.15) {
            power = 30;
        } else if (chance < 0.35) {
            power = 50;
        } else if (chance < 0.65) {
            power = 70;
        } else if (chance < 0.85) {
            power = 90;
        } else if (chance < 0.95) {
            power = 110;
        } else {
            power = 150;
        }
        return super.calcBaseDamage(attacker, defender);
    }

    @Override
    protected String describe() {
        return "использует Magnitude";
    }
}
