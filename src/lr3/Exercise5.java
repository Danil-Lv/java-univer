package lr3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");

        int x = in.nextInt();
        int sum = 0;
        int z = 0;
        for (int i = 0; z != x; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum = sum + i;
                z++;
                System.out.println(i);
            }
        }
        System.out.printf("Сумма: %d", sum);

//        int n = 0;
//        while (x != 0) {
//            if (n % 5 == 2 || n % 3 == 1) {
//                x--;
//                System.out.println(n);
//                sum = sum + n;
//            }
//            n++;
//        }
//        System.out.printf("Сумма: %d", sum);

    }
}
