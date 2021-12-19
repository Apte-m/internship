import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;



public class ListDemo {
    /*
    ArrayList — коллекция на основе массива. Имеет свойство изменять свой размер в зависимости от
        того удаляются или добавляются элементы.
    LinkedList — коллекция на основе связанного списка. Элементы помещенные в данную коллекцию
        сохраняют свой порядок вставки. То есть, в каком порядке был вставлен элемент, в таком порядке
        он будет при выводе. Каждый элемент, который хранится в LinkedList, содержит ссылки на «соседей».
        Это упрощает добавление и удаление элементов в списке. Классы ArrayList и Vector предпочтительнее
        использовать для поиска элементов, потому что эти классы используют индексы для доступа к элементам.
        Однако вставка и удаление элементов для них будет медленнее, чем LinkedList.
    Vector — тот же самый ArrayList с той разницей, что методы данной коллекции синхронизованы.
        То есть, потокобезобасны.
    Stack — список, который реализует данные стека. Элементы размещаются по принципу LIFO,
        last-in, first-out — последний пришел, первым ушел.
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();//создание нового списка
        stringList.add("Ivan");//добавление элементов
        stringList.add("Elena");
        stringList.add("Sergey");
        stringList.add("ISergey");
        System.out.println(stringList.size());//размер списка
        stringList.get(1);//получения элемента по индексу (начинается с 0 элемента)
        boolean isEmpty = stringList.isEmpty();//проверка списка на пустоту
        System.out.println(isEmpty);
        System.out.println("Просто вывод элементов");
        stringList.stream().forEach(s-> System.out.println(s));//очень полезный метод стрим
        stringList.stream().filter(s-> s.startsWith("I")).map(String::toLowerCase).forEach(System.out::println);
    }
}
