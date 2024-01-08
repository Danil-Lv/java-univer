package lr6.ex10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnMinAndMaxInArray(2, 4, 1, 6, 45)));

    }

    public static int[] returnMinAndMaxInArray(int... nums) {
        int[] numsArr = {Arrays.stream(nums).min().getAsInt(), Arrays.stream(nums).max().getAsInt()};
        return numsArr;
    }
}
