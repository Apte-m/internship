import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetDemo {

    /*

    HashSet — набор, в котором элементы хранятся в хеш-таблице. Не упорядочен.
        HashSet использует метод hashCode своих элементов для определения их размещения в наборе.
    LinkedHashSet — элементы хранятся в виде связанного списка.
    TreeSet — хранит элементы в структуре данных дерева, которая также сортируется и доступна для навигации.
        Методы добавление, удаление и получить элемент,
        гарантируют работу в log(n) времени, где n — количество элементов в дереве.

     */
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(15);
        set.add(30);
        set.add(30);
        set.add(30);
        System.out.println(set);
        set.remove(20);
        System.out.println(set);
    }
}
