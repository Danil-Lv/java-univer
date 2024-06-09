package lr7.ex5;

public class Main {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass("default");
        DerivedClass1 derivedClass1 = new DerivedClass1("custom1", 10);
        DerivedClass2 derivedClass2 = new DerivedClass2("custom2", 'a');

        baseClass.displayInfo();
        derivedClass1.displayInfo();
        derivedClass2.displayInfo();

        BaseClass special = new DerivedClass1("special", 200);
        special.displayInfo();
    }

    private static class BaseClass {
        protected String stringField;

        BaseClass(String stringField) {
            this.stringField = stringField;
        }

        public void displayInfo() {
            String classDetails;
            classDetails = "(base) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " stringField = " + this.stringField;
            System.out.println(classDetails);
        }
    }

    private static class DerivedClass1 extends BaseClass {
        protected int intField;

        DerivedClass1(String stringField, int intField) {
            super(stringField);
            this.intField = intField;
        }

        @Override
        public void displayInfo() {
            String classDetails;
            classDetails = "(derived1) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " stringField = " + this.stringField + "\n" +
                    " intField = " + this.intField;
            System.out.println(classDetails);
        }
    }

    private static class DerivedClass2 extends BaseClass {
        protected char charField;

        DerivedClass2(String stringField, char charField) {
            super(stringField);
            this.charField = charField;
        }

        @Override
        public void displayInfo() {
            String classDetails;
            classDetails = "(derived2) Class name: " + this.getClass().getSimpleName() + "\n" +
                    " stringField = " + this.stringField + "\n" +
                    " charField = " + this.charField;
            System.out.println(classDetails);
        }
    }
}
