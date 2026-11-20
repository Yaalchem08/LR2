package Pokemon;

import Move.*;
import ru.ifmo.se.pokemon.*;

public final class Pinsir extends Pokemon {
    public Pinsir(String name, int level) {
        super(name, level);
        setType(Type.BUG);
        setStats(65, 125, 100, 55, 70, 85);
        setMove(new StoneEdge());
        addMove(new XScissor());
        addMove(new DoubleHit());
        addMove(new ViceGrip());
    }
}
