package Cycles;

public class EmptyRectangle {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10)
        {
            int q = 0;
            while (q < 20)
            {
                if (i == 0 || i == 9)
                {
                    System.out.print("Б");
                }
                else if (q == 0 || q == 19)
                {
                    System.out.print("Б");
                }
                else
                {
                    System.out.print(" ");
                }
                q++;
            }
            System.out.println();
            i++;
        }

    }
}
