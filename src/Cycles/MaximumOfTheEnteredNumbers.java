package Cycles;

import java.util.Scanner;

public class MaximumOfTheEnteredNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt())
        {
            int i = console.nextInt();
            if (i % 2 == 0 && i > max)
            {
                max = i;
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
