package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

    // Метод для фильтрации строк
    public static List<String> filterStrings(List<String> inputList) {
        List<String> resultList = new ArrayList<>();

        for (String str : inputList) {
            if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                resultList.add(str);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Loshkarev");
        inputList.add("mouse");
        inputList.add("ping");
        inputList.add("Danil");
        inputList.add("Igorevich");
        inputList.add("java");
        inputList.add("project");

        List<String> filteredList = filterStrings(inputList);

        System.out.println("Список: " + inputList);
        System.out.println("Список после фильтрации строк: " + filteredList);
    }
}
