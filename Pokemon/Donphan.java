package Pokemon;

import Move.*;
import ru.ifmo.se.pokemon.*;

public final class Donphan extends Phanpy {
    public Donphan(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(90, 120, 120, 60, 60, 50);
        addMove(new Magnitude());
    }
}
