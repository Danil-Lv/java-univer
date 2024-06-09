package lr13.Example1;

public class Ex13 {
    public static class Main { // Делаем Main статическим
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("Длина массива = " + l);

                if (l != 0) {
                    int h = 10 / l; // Потенциально вызывает деление на ноль
                    args[l - 1] = "10"; // Устанавливаем элемент по индексу l - 1
                }
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }
        }
    }
}
