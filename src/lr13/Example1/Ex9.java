package lr13.Example1;

public class Ex9 {
    public static class Main {
        public int m() {
            try {
                System.out.println("0");
                return 55;    // Возвращаемое значение
            } finally {
                System.out.println("1");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.m());
    }
}
