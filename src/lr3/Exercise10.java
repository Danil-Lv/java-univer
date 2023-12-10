package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] nums = new Integer[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = random.nextInt(10);
        }
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));

    }
}
