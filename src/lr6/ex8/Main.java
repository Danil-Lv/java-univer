package lr6.ex8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4};
        System.out.println(averageArr(intArr));
    }

    public static double averageArr(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
