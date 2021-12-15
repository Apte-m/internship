package animal;

import box.BoxSize;
import food.Food;
import food.Grass;


public class Herbivore extends Animal {

    public Herbivore(String typeAnimal) {
        super(typeAnimal);
    }


    public Food eatFood(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            return food;
        } else {
            throw new WrongFoodException(getName());
        }
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public int swim() {
        return 0;
    }
}
