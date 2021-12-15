package animal;

import box.BoxSize;
import property.Swim;
import property.Voice;

public class Shark extends Carnivorous implements Swim, Voice {
    BoxSize boxSize = BoxSize.MEDIUM;

    public Shark() {
        super("Маша");
    }

    public BoxSize getBoxSize() {
        return boxSize;
    }

    @Override
    public int swim() {
        return 110;
    }

    @Override
    public String voice() {
        return null;
    }
}
