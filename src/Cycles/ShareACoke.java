package Cycles;

import java.util.Scanner;

public class ShareACoke {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bottles = console.nextInt();
        int people = console.nextInt();
        double result = bottles * 1.0 / people;
        System.out.println(result);
    }
}
