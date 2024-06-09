package lr9.Number6.СравнениеВремениДобавления;

import java.util.ArrayList;
import java.util.List;

public class AddingToTheMiddleArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }

        // ���������� �������� � �������� ArrayList
        long startTimeArrayList = System.nanoTime();
        arrayList.add(arrayList.size() / 2, 999);
        long endTimeArrayList = System.nanoTime();
        long durationArrayList = endTimeArrayList - startTimeArrayList;
        System.out.println("����� ����������� �� ���������� �������� � �������� ArrayList: " + durationArrayList + " ����������");
    }
}

