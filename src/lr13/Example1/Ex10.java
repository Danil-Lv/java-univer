package lr13.Example1;

public class Ex10 {
    public class Main {
        public int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                // return 20; // Нельзя изменять значение из блока finally
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Ex10().new Main(); // Создаем экземпляр внутреннего класса Main
        System.out.println(main.m());
    }
}
