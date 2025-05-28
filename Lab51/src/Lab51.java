import java.math.BigInteger;

public class Lab51 {
    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int count = 0;
        int requiredCount = 5;

        System.out.println("Первые " + requiredCount + " простых чисел, превышающих Long.MAX_VALUE:");
        while (count < requiredCount) {
            if (start.isProbablePrime(10)) {
                System.out.println(start);
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
    }
}
