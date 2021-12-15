package animal;

import box.BoxSize;
import property.Run;
import property.Swim;
import property.Voice;

public class Elephant extends Herbivore implements Run, Voice, Swim {
    BoxSize size = BoxSize.HUGE;

    public Elephant() {
        super("Луиджи");
    }

    @Override
    public BoxSize getSize() {
        return size;
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public int swim() {
        return 20;
    }

    @Override
    public String voice() {
        return "Уууууиииииии";
    }
}
