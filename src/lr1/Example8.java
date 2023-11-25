package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String day = in.nextLine();
        String month = in.nextLine();
        short data = in.nextShort();

        System.out.printf("%s, %d, %s", day, data, month);

        in.close();


    }
}
