package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        int year_of_birth = in.nextShort();
        int age = 2023 - year_of_birth;

        System.out.println(name + " " + age);

        in.close();
    }
}
