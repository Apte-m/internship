package worker;

import food.Food;

public class Worker {
    public void feed(Food eatFood) {
        if (eatFood != null) {
            System.out.println(eatFood + " Сьели");
        }
        else {
            System.out.println("Сам жри");
        }
    }

    public void getVoiceHumanRequirementAnimals(String animalType, String animalVoice) {
        if (animalVoice != null) {
            System.out.println(animalType + " прокричал " + animalVoice);
        } else {
            System.out.println(animalType + " не может издавать звуки");
        }

    }
}
