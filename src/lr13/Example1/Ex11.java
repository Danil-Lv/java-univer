package lr13.Example1;

public class Ex11 {
    public static void m(String str, double chislo) {
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Аргумент превышает значение");
        }
        if (str == null) {
            throw new IllegalArgumentException("Строка не должна быть пустой");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
