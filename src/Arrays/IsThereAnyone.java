package Arrays;

import java.util.Arrays;

public class IsThereAnyone {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] arr2 = Arrays.copyOf(array, array.length);
        Arrays.sort(arr2);
        int index = Arrays.binarySearch(arr2, element);

        System.out.println(index >= 0);

    }
}
