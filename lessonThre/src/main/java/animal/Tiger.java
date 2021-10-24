package animal;

import box.BoxSize;
import property.Run;
import property.Swim;
import property.Voice;

public class Tiger extends Carnivorous implements Run, Swim, Voice {
    BoxSize size = BoxSize.LARGE;

    public Tiger() {
        super("Ширхан");
    }

    @Override
    public BoxSize getSize() {
        return size;
    }

    @Override
    public int run() {
        return 30;
    }

    @Override
    public int swim() {
        return 20;
    }

    @Override
    public String voice() {
        return "Рррррр";
    }
}
