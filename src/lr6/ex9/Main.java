package lr6.ex9;

public class Main {
    public class ArrayReversal {
        public static void reverseArray(char[] arr) {
            int length = arr.length;
            for (int i = 0; i < length / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[length - 1 - i];
                arr[length - 1 - i] = temp;
            }
        }

        public static void main(String[] args) {
            char[] myArray = {'H', 'e', 'l', 'l', 'o'};
            reverseArray(myArray);
            System.out.println(myArray);  // Выводит "olleH"
        }
    }

}
