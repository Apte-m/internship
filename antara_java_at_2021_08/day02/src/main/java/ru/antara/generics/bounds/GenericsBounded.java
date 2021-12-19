package ru.antara.generics.bounds;

import ru.antara.generics.entries.Animal;
import ru.antara.generics.entries.Cat;
import ru.antara.generics.entries.HomeCat;
import ru.antara.generics.entries.WildCat;


public class GenericsBounded<T extends Cat> {

  public static void main(String[] args) {

    //GenericsBounded<Animal> genericsBounded = new GenericsBounded<>(); //ошибка
    GenericsBounded<Cat> ok1 = new GenericsBounded<>();
    GenericsBounded<HomeCat> ok2 = new GenericsBounded<>();
    GenericsBounded<WildCat> wk = new GenericsBounded<>();
  }

}
