package lr9.Number6.СравнениеВремениДобавления;

import java.util.HashMap;

public class AddingToTheMiddleHashSet {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // �������� ��������� �����

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < 50000; i++) {
            hashMap.put(i, "Value" + i);
        }

        for (int i = 50000; i < 150000; i++) {
            hashMap.put(i, "Value" + i);
        }

        long endTime = System.nanoTime(); // �������� �������� �����
        long duration = endTime - startTime; // ��������� ����� ���������� �������� � ������������

        System.out.println("����� ����������� �� ���������� ��������� � �������� HashMap: " + duration + " ����������");
    }
}
