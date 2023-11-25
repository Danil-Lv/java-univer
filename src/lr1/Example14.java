package lr1;

import java.util.Scanner;

public class Example14 {
    public static int pow (int value){
        return value*value;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int b = a - 1;
        int c = a + 1;
        int d = pow(b+c);

        System.out.printf("%d, %d, %d, %d", b, a, c, d);

        in.close();


    }
}
