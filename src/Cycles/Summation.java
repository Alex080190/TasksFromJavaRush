package Cycles;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        while (!isExit)
        {

            if (console.hasNextInt())
            {
                int i = console.nextInt();
                sum += i;
            }
            else if (console.hasNextLine())
            {
                String str = console.nextLine();
                if (str.equals("ENTER"))
                {
                    isExit = true;
                }
            }

        }
        System.out.println(sum);

    }
}
