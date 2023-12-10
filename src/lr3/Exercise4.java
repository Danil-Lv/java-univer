package lr3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
//
//        while (min <= max) {
//            System.out.println(min);
//            min++;
//        }

    }
}
