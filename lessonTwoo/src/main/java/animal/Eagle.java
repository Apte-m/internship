package animal;

import property.Fly;
import property.Run;
import property.Swim;
import property.Voice;

public class Eagle extends Carnivorous implements Fly, Run, Voice {
    public Eagle() {
        super("Орел");
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
    public String voice() {
        return "Орилиный крик";
    }
}
