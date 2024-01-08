package lr6.ex2;

public class Main {
    public static void main(String[] args) {
        Example.getA();
        Example.getA();
    }
}

class Example {
    private static int a = 0;

    public static void getA() {
        System.out.println(a);
        a++;
    };
}