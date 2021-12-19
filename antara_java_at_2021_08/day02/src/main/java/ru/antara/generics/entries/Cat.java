package ru.antara.generics.entries;


public class Cat extends Animal {
  protected int tailSize = 1;

  @Override
  public String toString() {
    return "Cat";
  }

  public String getMyau() {
    return "Myauuu";
  }

}
