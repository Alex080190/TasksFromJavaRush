package Cycles;

import java.util.Scanner;

public class ThereIsNoSuchThingAsALlotOfGood {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String str = console.nextLine();
        int number = console.nextInt();
        int counter = 0;
        do
        {
            System.out.println(str);
            counter++;
            if(number <=0 || number >= 5)
                break;

        }while(counter < number);

    }
}
