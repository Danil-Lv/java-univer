package lr6.ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println(Ex.sum(3));
    }
}

class Ex {
    public static int sum(int n) {
        int res = 0;
        int count = 1;

        while (count != n + 1) {
            res = res + (int) Math.pow(count, 2);
            count++;
        }

        return res;

    }
}
