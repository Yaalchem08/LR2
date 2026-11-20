package Pokemon;

import Move.*;
import ru.ifmo.se.pokemon.*;

public class Phanpy extends Pokemon {
    public Phanpy(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(90, 60, 60, 40, 40, 40);
        setMove(new RockTomb());
        addMove(new DoubleTeam());
        addMove(new Slam());
    }
}
