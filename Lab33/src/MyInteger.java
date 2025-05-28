public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }


    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger obj) {
        return obj != null && isEven(obj.getValue());
    }

    public static boolean isOdd(MyInteger obj) {
        return obj != null && isOdd(obj.getValue());
    }

    public static boolean isPrime(MyInteger obj) {
        return obj != null && isPrime(obj.getValue());
    }

    public boolean equals(int other) {
        return this.value == other;
    }

    public boolean equals(MyInteger other) {
        return other != null && this.value == other.getValue();
    }

    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}