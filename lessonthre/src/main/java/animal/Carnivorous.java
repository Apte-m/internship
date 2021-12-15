package animal;

import box.BoxSize;
import food.Food;
import food.Meat;

public class Carnivorous extends Animal {


    public Carnivorous(String typeAnimal) {
        super(typeAnimal);
    }


    public Food eatFood(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
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
