package lr9.Number6.СравнениеВремениДобавления;

import java.util.LinkedHashMap;

public class AddingToTheEndLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 600000; i++) {
            linkedHashMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        linkedHashMap.put(600000, "Element600000");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ����������� �� ���������� �������� � ����� LinkedHashMap: " + duration + " ����������");
    }
}

