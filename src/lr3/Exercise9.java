package lr3;

import java.util.Arrays;
import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = random.nextInt(10);
        }

        int min = nums[0];
        int min_indx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                min_indx = i;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == min && i != min_indx) {
                System.out.printf("Минимальное число: %d, индекс: %d\n", nums[i], i);
            }
        }
        System.out.printf("Минимальное число: %d, индекс: %d", min, min_indx);
    }
}

