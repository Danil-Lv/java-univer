package lr6.ex6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(Ex.newArr(arr, 222)));
    }
}

class Ex {
    public static int[] newArr(int[] arr, int x) {

        if (x > arr.length) {
            return arr.clone();
        }

        return Arrays.copyOfRange(arr, 0, x);
    }
}
