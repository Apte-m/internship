package animal;

import property.Swim;

public class Shark extends Carnivorous implements Swim {
    public Shark() {
        super("Акула");
    }

    @Override
    public int swim() {
        return 110;
    }

}
