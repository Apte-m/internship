import animal.*;
import box.Box;
import box.BoxSize;
import food.Grass;
import food.Meat;
import worker.Worker;


public class Zoo {
    public static void main(String[] args)  {
        Herbivore fish = new Fish();
        Carnivorous tiger = new Tiger();
        Herbivore elephant = new Elephant();
        Carnivorous shark = new Shark();


        Worker worker = new Worker();
        Meat meat = new Meat();
        Grass grass = new Grass();

        try {
            worker.feed(elephant.eatFood(grass));
            worker.feed(elephant.eatFood(meat));
            worker.feed(tiger.eatFood(meat));
            worker.feed(tiger.eatFood(grass));
        } catch (WrongFoodException exception) {
            System.err.println("Еда не подходит " + exception);
        }

        Box<Herbivore> boxOne = new Box<Herbivore>(BoxSize.HUGE);

        boxOne.addAnimal(elephant);
        boxOne.addAnimal(fish);
//        boxOne.addAnimal(tiger);
        System.out.println(boxOne.getName("Луиджи"));
//        boxOne.removeAnimal("Тигр");
        System.out.println(boxOne);

        Box<Carnivorous> boxTwo = new Box<>(BoxSize.LARGE);
        boxTwo.addAnimal(tiger);
        boxTwo.addAnimal(shark);
        System.out.println(boxTwo);


    }

}

