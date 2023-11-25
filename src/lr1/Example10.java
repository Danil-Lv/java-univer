package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year_of_birth = in.nextShort();
        int age = 2023 - year_of_birth;

        System.out.println(age);

        in.close();

    }
}
