package lr9.Number6.СравнениеВремениПоИндексу;

import java.util.ArrayList;

public class ArrayListTime {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // ��������� ArrayList
        for (int i=0; i<1000000; i++) {
            arrayList.add(i);
        }

        // �������� ����� ���������� �������� ��������� �������� �� �������
        long startTime = System.nanoTime();

        int element = arrayList.get(500000);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime); // ����� ���������� �������� � ������������

        System.out.println("����� ����������� �� ��������� �������� �� ������� �� ArrayList: " + duration + " ����������");
    }
}
