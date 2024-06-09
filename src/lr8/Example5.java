package lr8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла => ");
        String fname = sc.nextLine();

        try {
            // Создаётся файл
            File f1 = new File(fname);
            f1.getParentFile().mkdirs();
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());

            System.out.println("Введите количество строк для записи в файл =>");
            int n = sc.nextInt();

            // Создается поток для записи с учетом типа данных – DataOutputStream,
            // и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine(); // очистка буфера
            for (int i = 0; i < n; i++) {
                System.out.println("Введите строку для записи в файл =>");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); // закрываем поток

            // Чтение и вывод данных из созданного файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}