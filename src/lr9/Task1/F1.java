package lr9.Task1;

public class F1 {
    public static int f(int n){
        int result;
        if (n == 1)
            return 1;
        else {
            result=f(n-1)*n;
            return result;
        }
    }
}
