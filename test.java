import java.util.LinkedList;

public class test {

    private LinkedList <Object> linkedList;

    public test() {
        linkedList = new LinkedList <>();
    }

    public Object print (){
        return linkedList;
    }

    public void enqueue(Object element) {
        linkedList.addLast(element);
    }

    public Object dequeue() {
        return linkedList.pollFirst();
    }

    public Object first() {
        return linkedList.peekFirst();
    }

    public static void main(String[] args) {
        test queue = new test();
        for (int i = 0; i<10; i++) queue.enqueue(i);
        System.out.println("Очередь: " + queue.print());
        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Удаление и выгрузка первого элемента: " + queue.dequeue());
        System.out.println("Первый элемент после удаления: " + queue.first());
        System.out.println("Очередь после удаления: " + queue.print());
    }
}