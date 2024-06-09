package lr9.Number6.СравнениеВремениУдаления;

import java.util.LinkedHashMap;

public class DeletingInEndLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 500000; i++) {
            linkedHashMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        linkedHashMap.remove(499999);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ���������� �������� �������� �������� � �����e LinkedHashMap: " + duration + " ����������");
    }
}
