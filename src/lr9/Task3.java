package lr9;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Ввод массива с помощью рекурсии
        inputArray(array, 0, scanner);

        System.out.print("Введенный массив: ");
        // Вывод массива с помощью рекурсии
        outputArray(array, 0);

        scanner.close();
    }

    // Рекурсивный метод для ввода массива
    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index == array.length) {
            return;
        }
        System.out.print("Введите элемент " + (index + 1) + ": ");
        array[index] = scanner.nextInt();
        inputArray(array, index + 1, scanner);
    }

    // Рекурсивный метод для вывода массива
    public static void outputArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        System.out.print(array[index] + " ");
        outputArray(array, index + 1);
    }
}
