package lr6.ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println(Ex.doubleFactorial(5));
    }
}

class Ex {
    public static int doubleFactorial(int num) {
        int res = num;

        int lastMultiplier= num % 2 == 0 ? 2 : 1;

        while (num != lastMultiplier) {
            res = res * (num - 2);
            num = num - 2;

        }

        return res;

    }

    ;
}
