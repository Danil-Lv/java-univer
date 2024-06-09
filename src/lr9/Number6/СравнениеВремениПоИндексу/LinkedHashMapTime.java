package lr9.Number6.СравнениеВремениПоИндексу;

import java.util.LinkedHashMap;
import java.util.Random;

public class LinkedHashMapTime {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Random random = new Random();

        // ��������� LinkedHashMap ���������� �������
        for (int i = 0; i < 1000000; i++) {
            map.put(i, random.nextInt(1000000));
        }

        long startTime = System.nanoTime();

        // �������� ������� �� �������
        int index = random.nextInt(1000000);
        int value = map.get(index);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // ������� ����� ���������� ��������
        System.out.println("����� ����������� �� ��������� �������� �� ������� �� LinkedHashMap: " + duration + " ����������");
    }
}


