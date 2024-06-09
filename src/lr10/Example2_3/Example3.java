package lr10.Example2_3;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        JSONArray books = new JSONArray();

        // Создание нового объекта книги
        JSONObject newBook = new JSONObject();
        newBook.put("title", "Война и мир");
        JSONObject author = new JSONObject();
        author.put("autor", "Лев Толстой");
        newBook.put("years", 1873);

        // Добавление книги в массив
        books.add(newBook);

        try (FileWriter file = new FileWriter("src/lr10/Example1/JSON/example3.json")) {
            file.write(books.toString());
            System.out.println("Данные успешно записаны в файл JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}