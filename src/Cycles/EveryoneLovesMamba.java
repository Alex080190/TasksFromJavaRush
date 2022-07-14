package Cycles;

import java.util.Scanner;

public class EveryoneLovesMamba {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int i = 0;
        while (i<10)
        {
            System.out.println(name + text);
            i++;
        }

    }
}
