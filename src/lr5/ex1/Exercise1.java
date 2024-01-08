package lr5.ex1;

public class Exercise1 {
    public static void main(String[] args) {
        Ex2 a = new Ex2();

        a.setC('q');
        System.out.println(a.getCodeC());
        a.getCAndCode();
    }
};

class Ex2 {

    private char c;

    public void setC(char c) {
        this.c = c;
    };

    public int getCodeC() {
        return (int) c;
    };

    public void getCAndCode() {
        System.out.printf("Символ: %s Код символа: %d", c, getCodeC());
    };


};