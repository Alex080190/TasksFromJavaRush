package Cycles;

import java.util.Scanner;

public class MinimumOfTheEnteredNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int min = Integer.MAX_VALUE;
        while (console.hasNextInt())
        {
            int i = console.nextInt();
            if (i < min)
            {
                min = i;
            }
            System.out.println();
        }
        System.out.println(min);

    }
}
