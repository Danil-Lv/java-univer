package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String month = in.nextLine();
        short days = in.nextShort();

        System.out.printf("Количество дней в месяце %s: %d", month, days);

        in.close();

    }
}
