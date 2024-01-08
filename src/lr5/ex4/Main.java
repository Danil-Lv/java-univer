package lr5.ex4;

public class Main {
    public static void main(String[] args) {
        Ex1 a = new Ex1('q', 22);

    }
}

class Ex1 {
    private char a;
    private int b;


    public Ex1(int y, char x) {
        a = x;
        b = y;
    };

    public Ex1(char y,  int x) {
        a = y;
        b = x;
    };

    public Ex1(double x) {
        b = Integer.parseInt (String.format("%.2f", x%1).substring(2));
        System.out.println(b);
        x = (int) x;
        a = (char) x;
        System.out.println(a);

    };

}