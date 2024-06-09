package lr9.Number6.СравнениеВремениУдаления;

import java.util.ArrayList;

public class DeletingInBeginningArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

// ���������� ������ ����������
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1); // ����������.New.�������� ��������
        long endTime = System.nanoTime();

        System.out.println("����� ���������� �������� �������� �������� �� ������ �� arrayList: " + (endTime - startTime) + " ����������");

    }
}
