package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 200;
        int countOfPeople = in.nextInt();
        in.nextLine();

        for (int a = countOfPeople; a != 0; a--) {
            String name = in.nextLine();
            sum = name.contains("+one") ? sum + 200 : sum + 100;
        }

        System.out.println(sum / 100 == 13 ? sum + 100 : sum);

    }
}
