package ru.antara.generics;

import java.util.HashMap;
import java.util.Map;


public class GenericClass<K, V> {

  private final Map<K, V> map = new HashMap<>();

  public static void main(String[] args) {
    GenericClass<Integer, String> genericsClass = new GenericClass<>();
    genericsClass.putVal(1, "data1");
    genericsClass.putVal(2, "data2");
    genericsClass.putVal(3, "data3");

    genericsClass.print();
  }

  private void putVal(K key, V val) {
    map.put(key, val);
  }

  private void print() {
    map.forEach((key, val) -> System.out.println("key:" + key + " , val:" + val));
  }


}
