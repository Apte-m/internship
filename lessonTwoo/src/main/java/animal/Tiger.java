package animal;

import property.Run;
import property.Swim;
import property.Voice;

public class Tiger extends Carnivorous  implements Run, Swim, Voice {
    public Tiger() {
        super("Тигр");
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
