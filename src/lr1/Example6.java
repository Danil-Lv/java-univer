package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String last_name = in.nextLine();
        String name = in.nextLine();
        String surname = in.nextLine();

        System.out.println("Hello" + " " + last_name + " " + name + " " + surname);

        in.close();

    }
}
