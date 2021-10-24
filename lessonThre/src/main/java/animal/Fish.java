package animal;

import box.BoxSize;
import property.Swim;
import property.Voice;

public class Fish extends Herbivore implements Swim, Voice {
    BoxSize boxSize = BoxSize.SMALL;

    public Fish() {
        super("Немо");
    }

    public BoxSize getBoxSize() {
        return boxSize;
    }

    @Override
    public int swim() {
        return 30;
    }

    @Override
    public String voice() {
        return null;
    }
}
