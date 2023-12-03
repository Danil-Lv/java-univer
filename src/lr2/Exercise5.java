package lr2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.printf("Количество тысяч в числе %d: %d", num, num / 1000);

        in.close();
        }
    }
