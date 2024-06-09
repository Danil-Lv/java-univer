package lr9.Number6.СравнениеВремениДобавления;

import java.util.LinkedHashMap;

public class AddingToTheMiddleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 500000; i++) {
            linkedHashMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        linkedHashMap.put(500000, "Element500000");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ����������� �� ���������� �������� � �������� LinkedHashMap: " + duration + " ����������");
    }
}
