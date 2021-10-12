package model;

import java.util.Random;

public class Kotik {

    private int weight;
    private String name;
    private String meow;
    private String typeFood;
    private int hungry;
    private static int count = 0;


    public Kotik(int weight, String name, String meow) {
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        count++;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public static int getCount() {
        return count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public boolean play() {
        if (getHungry() <= 0) {
            return false;
        } else {
            setHungry(getHungry() - 1);
            return true;
        }
    }

    public boolean sleep() {
        if (getHungry() <= 0) {
            return false;
        } else {
            setHungry(getHungry() - 1);
            return true;
        }
    }

    public boolean chaseMouse() {
        if (getHungry() <= 0) {
            return false;
        } else {
            setHungry(getHungry() - 1);
            return true;
        }
    }

    public boolean say() {
        if (getHungry() <= 0) {
            return false;
        } else {
            setHungry(getHungry() - 1);
            return true;
        }
    }

    public boolean eat(int hungry) {
        this.hungry = hungry;
        if (getHungry() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eat(int hungry, String typeFood) {
        this.hungry = hungry;
        this.typeFood = typeFood;
        if (getHungry() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eat() {
        return eat(13, "Вискас");
    }


    Random random = new Random();

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            switch (random.nextInt(5)) {
                case 1:
                    if (play()) {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " У меня все нормально не мешай играть");
                    } else {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Я не буду играть");
                    }
                    break;
                case 2:
                    if (sleep()) {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Я устал буду спать не мешай мне кожанный");
                    } else {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Не буду спать");
                    }
                    break;
                case 3:
                    if (chaseMouse()) {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Я ловлю мышей не мешай мне");
                    } else {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Не буду ничего делать");
                    }
                    break;
                case 4:
                    if (say()) {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Мяу");
                    } else {
                        System.out.println(getName() + " с весом " + getWeight() + " кг " + " Я не буду мяукать");
                    }
                    break;

            }
        }
    }
}







