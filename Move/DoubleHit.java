package Move;

import ru.ifmo.se.pokemon.*;

public final class DoubleHit extends PhysicalMove {
    public DoubleHit() {
        super(Type.NORMAL, 35, 0.9, 0, 2);
    }


    @Override
    protected String describe() {
        return "использует DoubleHit";
    }
}
