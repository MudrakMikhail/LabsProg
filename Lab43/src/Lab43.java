import java.math.BigInteger;

public class Lab43 {
    public static void main(String[] args) {
        long maxValue = Long.MAX_VALUE;
        long startN = (long) Math.sqrt(maxValue) + 1;
        int count = 0;
        int requiredCount = 10;

        System.out.println("Первые " + requiredCount + " квадратных чисел, превышающих Long.MAX_VALUE:");
        while (count < requiredCount) {
            BigInteger n = BigInteger.valueOf(startN);
            BigInteger square = n.multiply(n);

            System.out.println(square);
            count++;
            startN++;
        }
    }
}
