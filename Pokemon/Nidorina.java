package Pokemon;

import Move.*;
import ru.ifmo.se.pokemon.*;

public class Nidorina extends NidoranF {
    public Nidorina(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(70, 62, 67, 55, 55, 56);
        addMove(new Crunch());
    }
}
