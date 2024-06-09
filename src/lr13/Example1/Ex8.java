package lr13.Example1;

public class Ex8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) { // Обработка исключения RuntimeException
            System.out.println("Обработка исключения");
        } finally {
            System.out.println("1");
        }
        return 0; // Возвращаемое значение должно быть типа int
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
