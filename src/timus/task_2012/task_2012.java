package timus.task_2012;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        returnAnswer(in.nextInt());
    }
    public static void returnAnswer(int f) {
        int amount_tasks = 12 - f;
        int time = amount_tasks * 45;
        System.out.println(time / 60 < 4 ? "YES" : "NO");
    }
}
