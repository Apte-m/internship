import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;


public class MapDemo {
    /*
    HashMap — хранит ключи в hash-таблице. Она имеет наибольшую производительность.
        Однако такая реализация не гарантирует порядок элементов.

    TreeMap — хранит ключи в отсортированном порядке. Работает медленнее чем хэшмап.
    LinkedHashMap — хранит ключи в порядке их вставки в мап. Работает немного медленнее чем HashMap.
    WeakHashMap — реализация интерфейса Map на основе хэш-таблицы со слабыми ключами.
        Запись в WeakHashMap будет автоматически удалена, если ее ключ больше не используется обычным образом.
    Hashtable реализует интерфейс Map, которая хранит пары ключ-значения. Hashtable является синхронизированной
        и потокобезопасной коллекцией. Hashtable не допускается null-ключей и дублирующих ключей, а также null-значений.
    */
    public static void main(String[] args) {
        Map<Integer, String> users = new TreeMap<>();
        users.put(3, "Ivan");//добавление элементов
        users.put(2, "Nataliya");
        users.put(1, "Anton");
        System.out.println(users.get(2));//получение по ключу

        System.out.println(users.containsKey(1));//проверка есть значение с таким ключем
        //users.remove(1);//удаление по ключу
        System.out.println(users.containsKey(1));

        System.out.println(users.size());//размер мапы

        System.out.println(users.isEmpty());//проверка пустая ли мапа

        users.forEach((k, v) -> System.out.println(k + ": " + v));//элегантный вывод

        // нюансы HashMap и HashTable
        HashMap<Integer, String> studentsHashmap = new HashMap<Integer, String>();
        studentsHashmap.put(1, null);  // здесь все хорошо,
        studentsHashmap.put(null, "Dummy"); // и здесь тоже все без проблем

        Hashtable<Integer, String> studentsHashtable = new Hashtable<Integer, String>();
        studentsHashtable.put(1, "Dummy");  // здесь все хорошо,
//        studentsHashtable.put(2, null); // вылетит NullPointerException
    }
}
