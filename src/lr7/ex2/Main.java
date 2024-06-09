package lr7.ex2;

class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextLength() {
        return text.length();
    }
}

class SubClass extends SuperClass {
    public int number;

    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    @Override
    public void setText() {
        super.setText();
        this.number = 0;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        this.number = 0;
    }

    public void setText(int number) {
        super.setText();
        this.number = number;
    }

    public void setText(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}


public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Hello");
        System.out.println("Length of text in SuperClass: " + superClass.getTextLength());

        SubClass subClass = new SubClass(42, "World");
        System.out.println("Length of text in SubClass: " + subClass.getTextLength());
        System.out.println("Number in SubClass: " + subClass.number);

        subClass.setText();
        System.out.println("After setText(): Length of text in SubClass: " + subClass.getTextLength() + ", Number: " + subClass.number);

        subClass.setText("New Text");
        System.out.println("After setText(String): Length of text in SubClass: " + subClass.getTextLength() + ", Number: " + subClass.number);

        subClass.setText(123);
        System.out.println("After setText(int): Length of text in SubClass: " + subClass.getTextLength() + ", Number: " + subClass.number);

        subClass.setText("Another Text", 456);
        System.out.println("After setText(String, int): Length of text in SubClass: " + subClass.getTextLength() + ", Number: " + subClass.number);
    }
}
