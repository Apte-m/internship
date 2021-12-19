import ru.antara.generics.entries.Animal;
import ru.antara.generics.entries.Cat;
import ru.antara.generics.entries.HomeCat;
import ru.antara.generics.entries.WildCat;

public class PolyDemo {
    public static void main(String[] args) {

        Animal it = new HomeCat("Барсик");
        System.out.println("is HomeCat instance of Cat? " + (it instanceof Cat));

        System.out.println(it.toString());

        Cat tom = new WildCat("Кыс-кыс");
        System.out.println("is WildCat instance of HomeCat? " + (tom instanceof HomeCat));
        System.out.println(tom.toString());

        HomeCat fluffy = new HomeCat("Толстяк");
        fluffy.trySuper();
    }

}
