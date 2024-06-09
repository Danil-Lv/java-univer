package lr9.Task1;

public class R1 {
    public static void m(int x) {
        System.out.println("x="+x);
        if ((2*x+1) < 20) {
            m(2*x+1);
        }
    }
}