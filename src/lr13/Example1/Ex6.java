package lr13.Example1;

public class Ex6 {
    public static void main(String [] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Исключение");
        } catch (RuntimeException e) {
            System.out.println("3"); // Блок catch для RuntimeException
        } catch (Exception e) {
            System.out.println("2"); // Блок catch для Exception
        }
        System.out.println("4");
    }
}
