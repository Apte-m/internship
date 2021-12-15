package animal;

import box.BoxSize;
import food.Food;
import property.Swim;
import property.Voice;

public abstract class Animal implements Voice, Swim {
    private String name;
    private BoxSize size ;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BoxSize getSize() {
        return size;
    }

    public abstract Food eatFood(Food food) throws WrongFoodException;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
