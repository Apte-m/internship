package animal;

import property.Swim;

public class Carp extends Herbivore implements Swim {
    public Carp() {
        super("Карп");
    }

    @Override
    public int swim() {
        return 20;
    }



}
