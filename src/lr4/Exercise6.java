package lr4;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 7;
        int[][] array = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }


        int rowIndex = rand.nextInt(rows);
        int colIndex = rand.nextInt(cols);

        int[][] newArray = new int[rows - 1][cols - 1];
        int newRow = 0;

        for (int i = 0; i < rows; i++) {
            if (i == rowIndex) {
                continue;
            }

            int newCol = 0;

            for (int j = 0; j < cols; j++) {
                if (j == colIndex) {
                    continue;
                }

                newArray[newRow][newCol] = array[i][j];
                newCol++;
            }

            newRow++;
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
