package animal;

import food.Food;
import property.Run;
import property.Swim;
import property.Voice;

public class Elephant extends Herbivore implements Run, Voice, Swim {
    public Elephant() {
        super("Слон");
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
