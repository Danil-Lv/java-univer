package lr13.Example1;

public class Ex7 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Исключение");
        } catch (NullPointerException e) {
            System.out.println("1");
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException ex) {
                System.out.println("2");
            }
        }
        System.out.println("3");
    }
}
