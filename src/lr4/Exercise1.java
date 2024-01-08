package lr4;

public class Exercise1 {

    public static void main(String[] args) {

        int width = 23;
        int height = 11;
        System.out.println("*".repeat(width));

        for (int i = 0; i <= height - 3; i++) {
            System.out.print("*");
            for (int j = 0; j <= width - 3; j++) {

                System.out.print(" ");

            }
            System.out.print("*");
            System.out.print("\n");

        }

        System.out.print("*".repeat(width));

    }
}

