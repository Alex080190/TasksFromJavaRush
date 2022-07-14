package Cycles;

import java.util.Scanner;

public class WindSpeed {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int speed = console.nextInt();
        int speed2 = (int) Math.round(speed * 3.6);
        System.out.println(speed2);

    }
}
