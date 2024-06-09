package lr7.ex3;

class SuperClass {
    public int intValue;

    public SuperClass(int intValue) {
        this.intValue = intValue;
    }

    public void setValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return "SuperClass [intValue=" + intValue + "]";
    }
}

class SubClass1 extends SuperClass {
    public char charValue;

    public SubClass1(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    public void setValue(int intValue, char charValue) {
        super.setValue(intValue);
        this.charValue = charValue;
    }

    @Override
    public String toString() {
        return "SubClass1 [intValue=" + intValue + ", charValue=" + charValue + "]";
    }
}

class SubClass2 extends SubClass1 {
    public String stringValue;

    public SubClass2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }

    public void setValue(int intValue, char charValue, String stringValue) {
        super.setValue(intValue, charValue);
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "SubClass2 [intValue=" + intValue + ", charValue=" + charValue + ", stringValue=" + stringValue + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(10);
        System.out.println(superClass);

        SubClass1 subClass1 = new SubClass1(20, 'A');
        System.out.println(subClass1);

        SubClass2 subClass2 = new SubClass2(30, 'B', "Hello");
        System.out.println(subClass2);

        subClass1.setValue(40, 'C');
        System.out.println(subClass1);

        subClass2.setValue(50, 'D', "World");
        System.out.println(subClass2);
    }
}

