package DataTypes;

public class CorrectTypes {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value) {
        CorrectTypes.a = (byte) (value);
        CorrectTypes.b = (short) (value);
        CorrectTypes.c = (int) (value);
        CorrectTypes.d = value;
    }
}
