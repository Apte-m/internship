package animal;

import box.BoxSize;
import property.Fly;
import property.Run;
import property.Swim;
import property.Voice;

public class Eagle extends Carnivorous implements Fly, Run, Swim, Voice {
    BoxSize size = BoxSize.MEDIUM;

    public Eagle() {
        super("Бравос");
    }

    @Override
    public BoxSize getSize() {
        return size;
    }

    @Override
    public int fly() {
        return 40;
    }

    @Override
    public int run() {
        return 50;
    }

    @Override
    public int swim() {
        return 3;
    }

    @Override
    public String voice() {
        return null;
    }
}
