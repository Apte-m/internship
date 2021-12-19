package ru.antara.generics.bounds;

import java.util.ArrayList;
import java.util.List;
import ru.antara.generics.entries.Animal;
import ru.antara.generics.entries.Cat;
import ru.antara.generics.entries.HomeCat;
import ru.antara.generics.entries.WildCat;


public class Wildcard_1 {

  public static void main(String[] args) {

    List<Animal> animalList = new ArrayList<>();
    animalList.add(new Animal());

//    print(animalList);
//    printWild(animalList);

    List<Cat> catList = new ArrayList<>();
    catList.add(new Cat());
    catList.add(new HomeCat("Барсик"));
    catList.add(new WildCat("Багира"));

    List<HomeCat> homeCatList = new ArrayList<>(  );
    homeCatList.add(new HomeCat("Барсик"));
    printWild(homeCatList);

//    print(catList); //Ошибка
//    printWild(catList);

  }

  private static void print(List<Animal> animalList) {
    animalList.forEach(System.out::println);
  }

  private static void printWild(List<? extends Animal> animalList) {
    animalList.forEach(System.out::println);

  }

}
