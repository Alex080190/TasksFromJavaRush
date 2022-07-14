package Cycles;

import java.util.Scanner;

public class IsTheGlassHalfHmptyOrHalfFull {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean x = console.nextBoolean();
        if (x) {

            System.out.println((int) Math.ceil(glass));

        } else {
            System.out.println((int) Math.floor(glass));
        }

    }
}
