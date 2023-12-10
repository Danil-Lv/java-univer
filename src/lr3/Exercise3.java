package lr3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");

        int amount = in.nextInt();
        int current_num = 1;
        int last_num = 0;
        int temp = 0;

//        С помощью цикла for
        for (int i = 1; i <= amount; i++) {
            System.out.println(current_num);
            temp = current_num;
            current_num = last_num + current_num;
            last_num = temp;
        }

//        С помощью цикла while
//        while (amount != 0) {
//            System.out.println(current_num);
//            temp = current_num;
//            current_num = last_num + current_num;
//            last_num = temp;
//            amount--;
//        }

    }
}
