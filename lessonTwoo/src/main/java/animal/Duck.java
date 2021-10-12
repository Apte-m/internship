package animal;

import property.Fly;
import property.Run;
import property.Swim;
import property.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    public Duck() {
        super("Утка");
    }

    @Override
    public int fly() {
        return 10;
    }

    @Override
    public int run() {
        return 20;
    }

    @Override
    public int swim() {
        return 30;
    }

    @Override
    public String voice() {
        return "Кря-кря";
    }
}
