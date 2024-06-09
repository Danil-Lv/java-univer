package lr9.Number6.СравнениеВремениДобавления;

import java.util.HashSet;

public class AddingToTheEndHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 500000; i++) {
            hashSet.add(i);
        }

        long startTime = System.nanoTime();
        hashSet.add(500000);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ����������� �� ���������� �������� � ����� HashSet: " + duration + " ����������");
    }
}

