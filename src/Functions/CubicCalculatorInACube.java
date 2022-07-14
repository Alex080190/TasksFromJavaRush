package Functions;

public class CubicCalculatorInACube {
    public static void main(String[] args) {

    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long x) {
        long result = x;
        result = cube(result);
        result = cube(result);
        return result;
    }
}
