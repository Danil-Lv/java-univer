package lr13.Example1;

public class Ex5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Исключение");
        } catch (RuntimeException e) {
            System.out.println("1"); // Блок catch для обработки исключения RuntimeException
        }
        System.out.println("2");
    }
}
