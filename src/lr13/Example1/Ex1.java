package lr13.Example1;

public class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("An exception occurred"); // Throwing a RuntimeException
        } catch (RuntimeException e) {
            System.out.println("1  " + e);  // Catching and printing the exception
        }
        System.out.println("2");
    }
}
