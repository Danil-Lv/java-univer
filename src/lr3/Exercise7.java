package lr3;

import java.util.Arrays;
import java.util.Collections;

public class Exercise7 {
    public static void main(String[] args) {
        int size = 10;
        String[] words = new String[size];
        String letters = "abcdefghijklmnopqrstuvwxyz";

        int indx = 0;
        for (int i = 0; i < words.length * 2; i++) {
            if (i % 2 == 0) {
                words[indx] = Character.toString(letters.charAt(i));
                indx++;
            }
        }
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
