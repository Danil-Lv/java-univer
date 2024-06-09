package lr9.Number6.СравнениеВремениУдаления;

import java.util.HashSet;

public class DeletingInMiddleHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 500000; i++) {
            hashSet.add("Element" + i);
        }

        long startTime = System.nanoTime();
        hashSet.remove("Element250000");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ���������� �������� �������� �������� � �������� �� HashSet: " + duration + " ����������");
    }
}
