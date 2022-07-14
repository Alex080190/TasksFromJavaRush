package Arrays;

import java.util.Arrays;

public class FillingTheArray {
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {

        Arrays.fill (array, 0, array.length / 2 + array.length % 2, valueStart);
        Arrays.fill (array, array.length / 2 + array.length % 2, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
