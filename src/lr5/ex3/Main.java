package lr5.ex3;

public class Main {
    public static void main(String[] args) {
        Ex11 ob = new Ex11(1);
        System.out.println(ob);
    }
}

class Ex11 {
    private int a;
    private int b;

    public Ex11() {
        this.a = 1;
        this.b = 1;
    };

    public Ex11(int x) {
        this.a = x;
        this.b = x;
    };

    public Ex11(int x, int y) {
        this.a = x;
        this.b = y;
    };


}
