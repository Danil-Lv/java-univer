package lr13.Example1;

public class Ex12 {
    public static class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка не должна быть пустой");
            }
            if (chislo >= 0.001) { // Исправляем условие на >=, чтобы правильно обработать граничное значение
                throw new IllegalArgumentException("Аргумент превышает значение");
            } else {
                System.out.println("Аргументы корректны");
            }
        }

        public static void main(String[] args) {
            m("Пример", 0.000001); // В main вызываем метод с корректными аргументами
        }
    }
}
