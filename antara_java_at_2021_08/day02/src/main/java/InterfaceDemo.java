import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import ru.antara.generics.entries.Animal;


interface Baker {
    boolean prepare();
    void bake();
}


class Duck extends Animal implements Baker {
    public boolean prepare() {
        System.out.println("Ощипываем. Потрошим. Заполняем яблоками. Оборачиваем в фольгу");
        return true;
    };

    public void bake() {
        System.out.println("запекаем 1.5 часа");
    };
}


class AppleCake implements Baker {
    public boolean prepare() {
        System.out.println("Замешиваем тесто. Нарезаем и кладем яблоки в тесто.");
        return true;
    };

    public void bake() {
        System.out.println("Запекаем 45 мин");
    };
}


class Brick implements Baker {
    public boolean prepare() {
        System.out.println("Замешиваем глину. В форму и под пресс.");
        return true;
    };

    public void bake() {
        System.out.println("Запекаем сутки при большой температуре");
    };
}


public class InterfaceDemo {
    public static void main(String[] args) {
        Duck donald = new Duck();
        Animal a = donald;
        Baker b = donald;
        b.bake();

        List<Baker> bakeables = new ArrayList<>(Arrays.asList(new Duck(), new AppleCake(), new Brick()));
        for (Baker bk: bakeables) {
            if (bk.prepare()) {
                bk.bake();
            }
        }
    }
}
