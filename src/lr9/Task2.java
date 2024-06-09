package lr9;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.println("Двоичное представление: " + toBinary(number));
    }

    // Рекурсивный метод для перевода числа в двоичную систему
    public static String toBinary(int number) {
        if (number == 0) {
            return "0";
        } else if (number == 1) {
            return "1";
        } else {
            return toBinary(number / 2) + (number % 2);
        }
    }
}
