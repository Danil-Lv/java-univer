package lr10.Example2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/Example1/JSON/example3.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Название файла: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите автора для поиска: ");
            String searchAuthor = scanner.nextLine();

            boolean found = false;
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                String author = (String) book.get("autor");
                if (author.equalsIgnoreCase(searchAuthor)) {
                    found = true;
                    System.out.println("\nНайденная книга: ");
                    System.out.println("Название: " + book.get("title"));
                    System.out.println("Автор: " + author);
                    System.out.println("Год издания: " + book.get("year"));
                }
            }

            if (!found) {
                System.out.println("Автор " + searchAuthor + " не найден.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}