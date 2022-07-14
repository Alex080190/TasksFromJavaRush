package Arrays;

import java.util.Scanner;

public class TheMinimumOfNNumbers {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
