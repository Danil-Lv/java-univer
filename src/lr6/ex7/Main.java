package lr6.ex7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(intArr(arr)));
    }

    public static int[] intArr(char[] charArr) {

        int[] resArr = new int[charArr.length];

        for (int i = 0; i != charArr.length; i++) {
            resArr[i] = charArr[i];
        }
        return resArr;
    }
}
