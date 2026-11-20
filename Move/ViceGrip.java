package Move;

import ru.ifmo.se.pokemon.*;

public final class ViceGrip extends PhysicalMove {
    public ViceGrip() {
        super(Type.NORMAL, 55, 1.0);
    }


    @Override
    protected String describe() {
        return "использует ViceGrip";
    }
}
