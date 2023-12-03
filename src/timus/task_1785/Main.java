package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();

        if (amount >= 1 && amount <= 4) {
            System.out.println("few");
        } else if (amount >= 5 && amount <= 9) {
            System.out.println("several");
        } else if (amount >= 10 && amount <= 19) {
            System.out.println("pack");
        } else if (amount >= 20 && amount <= 49) {
            System.out.println("lots");
        } else if (amount >= 50 && amount <= 99) {
            System.out.println("horde");
        } else if (amount >= 100 && amount <= 249) {
            System.out.println("throng");
        } else if (amount >= 250 && amount <= 499) {
            System.out.println("swarm");
        } else if (amount >= 500 && amount <= 999) {
            System.out.println("zounds");
        } else if (amount >= 1000) {
            System.out.println("legion");
        }

        in.close();
    }
}
