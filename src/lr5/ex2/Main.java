package lr5.ex2;

public class Main {
    public static void main(String[] args) {
        Ex a = new Ex();
        a.getSymbols();
    }
}

class Ex {
    private char a = 'D';
    private char b = 'A';

    public void getSymbols() {
        int codeMax = Math.max((int) a, (int) b);
        int codeMin = Math.min((int) a, (int) b);

        while (codeMax >= codeMin) {
            System.out.println((char) codeMin);
            codeMin++;
        }
    };
}