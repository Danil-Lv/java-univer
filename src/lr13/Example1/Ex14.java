package lr13.Example1;

public class Ex14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Длина массива:  " + l);

            if (l != 0) {
                m(l);
            } else {
                System.out.println("Ошибка: пустой массив аргументов");
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
}
