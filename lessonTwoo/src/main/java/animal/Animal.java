package animal;

import food.Food;

public abstract class Animal  {
    private String typeAnimal;

    public Animal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getType() {
        return typeAnimal;
    }



    public abstract Food eatFood(Food food);

    @Override
    public String toString() {
        return typeAnimal;
    }


    public int swim() throws Exception {
        throw  new Exception(getType());
    }
}
