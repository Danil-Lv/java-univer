package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int age = in.nextInt();
        int year = 2023;

        System.out.println("Год рождения: " + (year - age));

        in.close();

    }
}
