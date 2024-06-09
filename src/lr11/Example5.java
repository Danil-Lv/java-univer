package lr11;

//        Пример программы, которая принимает на вход список строк и фильтрует строки,
//        содержащие заданную подстроку, которую нужно определить заранее.
import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("word");
        strings.add("program");
        strings.add("project");
        strings.add("example");

        // Фильтруем строки, содержащие подстроку "o"
        List<String> filteredStrings = filterStringsContainingSubstring(strings, "o");

        // Выводим отфильтрованные строки
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    // Метод для фильтрации строк, содержащих заданную подстроку
    public static List<String> filterStringsContainingSubstring(List<String> strings, String subString) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(subString)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
}
