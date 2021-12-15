import animal.*;
import food.Grass;
import food.Meat;
import property.Swim;
import worker.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {


    public static void main(String[] args) throws Exception {
        Fish fish = new Fish();
        Carp carp = new Carp();
        Tiger tiger = new Tiger();
        Elephant elephant = new Elephant();
        Eagle eagle = new Eagle();

        Worker worker = new Worker();
        // worker.getVoiceHumanRequirementAnimals(fish.getType(), fish);
        worker.getVoiceHumanRequirementAnimals(tiger.getType(), tiger);
        worker.getVoiceHumanRequirementAnimals(elephant.getType(), elephant);


        Meat meat = new Meat();
        Grass grass = new Grass();
        worker.feed(elephant, grass);
        worker.feed(elephant, meat);

        Animal[] animals = {fish, carp, tiger, elephant};//,eagle};
        for (Animal a : animals) {
            System.out.println(a.getType() + " плавает " + a.swim() + " метров");

        }


    }
}
