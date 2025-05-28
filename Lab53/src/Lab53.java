import java.math.BigInteger;

public class Lab53 {
    public static void main(String[] args) {
        BigInteger current = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        BigInteger five = BigInteger.valueOf(5);
        BigInteger six = BigInteger.valueOf(6);

        int count = 0;
        int requiredCount = 10;

        System.out.println("Первые " + requiredCount + " чисел, больших Long.MAX_VALUE, кратных 5 или 6:");
        while (count < requiredCount) {
            if (current.mod(five).equals(BigInteger.ZERO) || current.mod(six).equals(BigInteger.ZERO)) {
                System.out.println(current);
                count++;
            }
            current = current.add(BigInteger.ONE);
        }
    }
}

