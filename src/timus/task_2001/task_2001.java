package timus.task_2001;

import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();

        int a2 = in.nextInt();
        int b2 = in.nextInt();

        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int weight2 = b1 - b2; // вес урожая второго математика
        int weight1 = b3 - weight2 - b2; // вес урожая второго математика

        System.out.println(weight1 + " " + weight2);


    }
}
