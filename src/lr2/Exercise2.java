package lr2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num % 5 == 2 && num % 7 == 1) {
            System.out.println("Число удовлетворяет условию");
        }
        else {
            System.out.println("Число не удовлетворяет условию");
        }

        in.close();
    }
}
