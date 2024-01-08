package timus.task_1877;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first_code = in.nextInt();
        int second_code = in.nextInt();

        System.out.println(first_code % 2 == 0 || second_code % 2 != 0 ? "yes" : "no");
    }
}
