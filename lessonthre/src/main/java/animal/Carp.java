package animal;

import box.BoxSize;
import property.Swim;
import property.Voice;

public class Carp extends Herbivore implements Swim, Voice {
   BoxSize size = BoxSize.SMALL;

    public Carp() {
        super("Вася");
    }

    @Override
    public BoxSize getSize() {
        return size;
    }

    @Override
    public int swim() {
        return 20;
    }

    @Override
    public String voice() {
        return null;
    }
}
