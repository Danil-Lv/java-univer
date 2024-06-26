package lr8;

import java.io.*;

public class Example10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\My\\File1.txt"),
                            "cp1251"));
            out = new PrintWriter("D:\\My\\File2.txt", "cp1251");

            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}