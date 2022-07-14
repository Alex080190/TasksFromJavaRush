package Cycles;

import java.util.Scanner;

public class TheSecondMinimumNumberOfTheEntered {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < min)
        {
            int ept = min;
            min = secondMin;
            secondMin = ept;
        }
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (min == secondMin)
            {
                if (x < min)
                {
                    secondMin = min;
                    min = x;
                }
                else if (x > min && x < secondMin)
                {
                    secondMin = x;
                }
                else
                {
                    secondMin = x;
                }

            }
            if (min < secondMin)
            {
                if (x < min)
                {
                    secondMin = min;
                    min = x;
                }
                else if (x > min && x < secondMin)
                {
                    secondMin = x;
                }
            }
            System.out.println();
        }
        System.out.println(secondMin);
    }
}
