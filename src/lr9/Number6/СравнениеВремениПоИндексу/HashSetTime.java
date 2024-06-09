package lr9.Number6.СравнениеВремениПоИндексу;

import java.util.HashSet;
import java.util.Random;

public class HashSetTime {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        // ��������� HashSet ���������� �������
        for (int i = 0; i < 1000000; i++) {
            set.add(random.nextInt(1000000));
        }

        long startTime = System.nanoTime();

        // �������� ������� �� �������
        int index = random.nextInt(1000000);
        boolean contains = set.contains(index);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // ������� ����� ���������� ��������

        System.out.println("����� ����������� �� ��������� �������� �� ������� �� HashSet: " + duration + " ����������");
    }
}
