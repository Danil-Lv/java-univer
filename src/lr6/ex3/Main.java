package lr6.ex3;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        Ex.maxValue(numbers);

    }
}

class Ex {
    static int maxValue(int ... d) {
        return Arrays.stream(d).max().getAsInt();
    }

    static int minValue(int ... d) {
        return Arrays.stream(d).min().getAsInt();
    }

    static OptionalDouble averageValue(int ... d) {
        return Arrays.stream(d).average();
    }
}



