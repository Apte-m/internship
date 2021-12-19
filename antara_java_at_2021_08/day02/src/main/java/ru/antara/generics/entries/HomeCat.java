package ru.antara.generics.entries;


public class HomeCat extends Cat {
    private final String name;

    protected int tailSize = 2;


    public HomeCat(String name) {
        this.name = name;
    }

    public void sitOnBoss() {

    }

    @Override
    public String toString() {
        return "HomeCat, name:" + name;
    }

    public void trySuper() {
        System.out.println(toString() + " -> " + tailSize);
        System.out.println(super.toString() + " -> " + super.tailSize);
    }

}
