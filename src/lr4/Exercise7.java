package lr4;

public class Exercise7 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        int[][] array = new int[rows][columns];

        int counter = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = counter++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    array[i][j] = counter++;
                }
            }
        }

        // Вывод массива на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
