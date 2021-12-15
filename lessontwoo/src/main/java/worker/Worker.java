package worker;

import animal.Animal;
import food.Food;
import food.Grass;
import property.Voice;

public class Worker {
    public void feed(Animal animal, Food food) {
        if (animal.eatFood(food) == null ) {
            System.out.println(animal + " сказал, что не будет есть");

        } else

            System.out.println(animal + " Сьел");

    }

    public void getVoiceHumanRequirementAnimals(String animalType, Voice animalVoice) {

        System.out.println(animalType + " прокричал " + animalVoice.voice());

    }
}
