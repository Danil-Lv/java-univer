package lr3;

import java.util.Arrays;

public class Exercise8 {

    public static void main(String[] args) {

        String[] letters = new String[10];

        String letts = "BCDFGHJKLMNPQRSTVWXZ";

        for (int i = 0; i < letters.length; i++) {
            letters[i] = Character.toString(letts.charAt(i));
        };

        System.out.println(Arrays.toString(letters));


    }



}
