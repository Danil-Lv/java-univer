package lr9.Number6.СравнениеВремениДобавления;

import java.util.ArrayList;

public class AddingToTheBeginningArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }

        long endTime = System.nanoTime();
        long durationArrayList = endTime - startTime;
        System.out.println("����� ����������� �� ���������� ��������� � ������ ArrayList: " + durationArrayList + " ����������");
    }
}
