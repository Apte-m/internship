package animal;

import property.Swim;

public class Fish extends Herbivore implements Swim{
    public Fish() {
        super("Рыба");
    }

    @Override
    public int swim() {
        return 30;
    }


}
