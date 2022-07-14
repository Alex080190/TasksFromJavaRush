package Arrays;

import java.util.Scanner;

public class CreatingATwoDimensionalArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows;
        do {
            rows = console.nextInt();
        } while (rows <= 0);

        multiArray = new int[rows][];

        int columns;

        for (int i = 0; i < rows; i++) {
            columns = console.nextInt();
            if (columns > 0) {
                multiArray[i] = new int[columns];
            }
        }

    }
}
