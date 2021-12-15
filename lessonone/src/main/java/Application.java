import model.Kotik;

import java.util.Random;

public class Application {
    public static void main(String[] args) {



        Kotik kotikOne = new Kotik(2, "Begemot", "Мяуу");
        Kotik kotikTwo = new Kotik(5, "cat is a scientist", "Мяу");

        kotikTwo.eat(12,"Овсянка");
        kotikOne.eat(8);
        kotikOne.liveAnotherDay();
        kotikTwo.liveAnotherDay();


        System.out.println(Kotik.getCount());
        System.out.println(kotikOne.getMeow().equals(kotikTwo.getMeow()));



    }


}

