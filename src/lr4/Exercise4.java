package lr4;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {

        int[][] arr = new int[6][];

        for (int i = 1; i <= 5; i++) {
            arr[i] = new int[i];
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
