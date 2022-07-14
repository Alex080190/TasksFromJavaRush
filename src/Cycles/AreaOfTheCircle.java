package Cycles;

import java.util.Scanner;

public class AreaOfTheCircle {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int radius = console.nextInt();
        double p = 3.14;
        if(radius >=0)
        {
            int s = (int)(p * radius * radius);
            System.out.println(s);
        }

    }
}
