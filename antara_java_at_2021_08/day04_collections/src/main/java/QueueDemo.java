import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    /*
    Queue — коллекция, которая хранит элементы в определенном порядке, нужном для их обработки.
        Помимо основных методов Collection в этом интерфейсе добавлены дополнительные методы вставки,
        проверки, извлечения. В данной коллекции элементы обычно размещаются в порядке FIFO,
        first-in, first-out — первым пришел, первым ушел.
    PriorityQueue — очередь, в которой элементы упорядочиваются на основании заданного вами параметра,
    в отличие от обычной на основе FIFO. Эта очередь упорядочивает элементы либо по их натуральному порядку
    (используя интерфейс Comparable), либо с помощью интерфейса Comparator, полученному в конструкторе.
    */
    public static void main(String[] args) {
//        queueMethods();
        priorityQueueDemo();
    }

    public static void queueMethods() {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.offer(80);//добавление
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());//удаление сверху
        System.out.println(priorityQueue.peek());//получить верхний
        System.out.println(priorityQueue);
    }

    public static void priorityQueueDemo() {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer comp1, Integer comp2) {//настроили метод таким образом, что элементы будут добавляться в обратном порядке
                if( comp1 > comp2 ){
                    return -1;
                }
                if( comp1 < comp2 ){
                    return 1;
                }
                return 0;
            }
        };
        Queue<Integer> priorityQueue = new PriorityQueue<>(10, comparator);
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(80);
        System.out.println(priorityQueue);
    }
}
