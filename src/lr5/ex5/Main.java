package lr5.ex5;

public class Main {
    public static void main(String[] args) {
        IntegerField a = new IntegerField(1);
        System.out.println(a.getField());
    }
}

class IntegerField {
    private int field;


    public void setField(int field) {
        this.field = field <= 100 ? field : 100;
    }

    public void setField() {
        this.field = 0;
    }

    public int getField() {
        return field;
    }

    public IntegerField(int field) {
        this.field = field <= 100 ? field : 100;
    }

    public IntegerField() {
        this.field = 0;
    }
}
