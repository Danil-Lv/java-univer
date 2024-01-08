package lr6.ex1;

public class Main {
    private static char charField;
    private static String stringField;

    public static void main(String[] args) {
        char[] a = {};
        setCharOrStringField(a);
    }

    public static void setCharField(char charField) {
        charField = charField;
    }

    public static void setCharOrStringField(char[] charArray) {
        if (charArray.length == 1) {
            charField = charArray[0];
        }
        else if (charArray.length > 1) {
            stringField = new String(charArray);
        }

    }

    public static void setStringField(String stringField) {
        stringField = stringField;
    }
}

