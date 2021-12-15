package animal;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous(String typeAnimal) {
        super(typeAnimal);
    }

    public Food eatFood(Food food) {
        if (food instanceof Meat) {
           return  food;
        } else {
            return null;
        }



    }


}
