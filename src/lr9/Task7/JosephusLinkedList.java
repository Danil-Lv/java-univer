package lr9.Task7;

import java.util.LinkedList;
import java.util.ListIterator;

public class JosephusLinkedList {
    public static void main(String[] args) {
        int N = 10;  // количество человек
        LinkedList<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        ListIterator<Integer> iterator = circle.listIterator();
        while (circle.size() > 1) {
            if (!iterator.hasNext()) {
                iterator = circle.listIterator(); // перезапуск итератора с начала списка
            }
            iterator.next();  // перемещение на следующего человека
            if (!iterator.hasNext()) {
                iterator = circle.listIterator(); // перезапуск итератора с начала списка
            }
            iterator.next();  // перемещение на следующего человека
            iterator.remove(); // вычеркивание человека
        }

        System.out.println("Оставшийся человек: " + circle.get(0));
    }
}
