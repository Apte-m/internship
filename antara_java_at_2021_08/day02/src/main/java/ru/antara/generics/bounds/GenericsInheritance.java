package ru.antara.generics.bounds;

import java.util.ArrayList;
import java.util.List;
import ru.antara.generics.entries.Animal;
import ru.antara.generics.entries.Cat;


public class GenericsInheritance {

  public static void main(String[] args) {

    Animal cat = new Cat();

    List<Cat> catList = new ArrayList<>();
    //List<Animal> animalList = catList; //ошибка
  }
}
