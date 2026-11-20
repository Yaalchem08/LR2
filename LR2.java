import ru.ifmo.se.pokemon.*;
import Pokemon.*;

public final class LR2 {
    public static void main(String[] args) {
        Battle b = new Battle();

        // Создание первой команды
        b.addAlly(new Pinsir("Жук", 22));
        b.addAlly(new Phanpy("Слонёнок", 24));
        b.addAlly(new Donphan("Бивень", 30));

        // Создание второй команды
        b.addFoe(new NidoranF("Иголка", 1));
        b.addFoe(new Nidorina("Нина", 43));
        b.addFoe(new Nidoqueen("Королева", 43));

        b.go();
    }
}
