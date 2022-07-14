package Cycles;

import java.util.Scanner;

public class WeShowThatWeGet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true)
        {
            String name = console.nextLine();

            if (name.equals("enough"))
            {
                break;
            }
            System.out.println(name);
        }

    }
}
