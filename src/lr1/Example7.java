package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        short age = in.nextShort();

        System.out.printf("Name: %s Age: %d", name, age);

        in.close();

    }
}
