package animal;

import food.Food;
import food.Grass;
import food.Meat;


public class Herbivore extends Animal {


    public Herbivore(String typeAnimal) {
        super(typeAnimal);
    }


    public Food eatFood(Food food) {
        if (food instanceof Grass) {
            return food;
        } else {
            return null;
        }


    }
}
