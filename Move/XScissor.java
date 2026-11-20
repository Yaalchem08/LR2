package Move;

import ru.ifmo.se.pokemon.*;

public final class XScissor extends PhysicalMove {
    public XScissor() {
        super(Type.BUG, 80, 1.0);
    }


    @Override
    protected String describe() {
        return "использует XScissor";
    }
}
