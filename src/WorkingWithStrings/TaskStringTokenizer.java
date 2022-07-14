package WorkingWithStrings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TaskStringTokenizer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer s = new StringTokenizer(query, delimiter);
        String[] result = new String[6];
        int i = 0;
        while (s.hasMoreTokens())
        {
            result[i++] = s.nextToken();
        }

        return result;
    }
}
