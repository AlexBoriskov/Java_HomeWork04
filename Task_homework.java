import java.util.LinkedList;

public class Task_homework {
    public static void main(String[] args) {
        /*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

        LinkedList <Integer> list = new LinkedList<Integer>();
        for (int index = 0; index < 11; index++) list.add(index);
        System.out.println(list);
        Reverse(list);
        System.out.println(list);
    }

    static void Reverse(LinkedList<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            Integer temp = list.remove(list.size()-2-i);
            list.add(temp);
        }
    }
}
