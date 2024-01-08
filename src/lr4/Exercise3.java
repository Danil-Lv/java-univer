package lr4;


import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {


        int[] arr1 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] arr2 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] arr3 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] arr4 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] arr5 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        int[][] arr = new int[5][];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        arr[3] = arr4;
        arr[4] = arr5;

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}

