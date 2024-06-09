package lr9.Number6.СравнениеВремениДобавления;

import java.util.ArrayList;
import java.util.List;

public class AddingToTheEndArrayList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        // ��������� ������� ���������� �������� ���������� � ����� arrayList
        System.out.println("����� ���������� �������� ���������� � ����� ArrayList: " + getRunningTime(arrayList) + " ����������");
    }

    private static long getRunningTime(List<Integer> list) {

        // ����� ������ ������� ������� ���������� ���������
        long start = System.nanoTime();

        // ���� ����, � ������� ����������� �������� ����������
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // ����� ��������� ������� ������� ���������� ���������
        long end = System.nanoTime();

        // ����� � ������� ������� ���������� ����� ����, ����������� ��������
        return end - start;
    }
}
