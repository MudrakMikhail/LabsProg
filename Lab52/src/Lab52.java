import java.math.BigInteger;

public class Lab52 {
    public static void main(String[] args) {
        for (int p = 2; p <= 100; p++) {
            BigInteger mersenneNumber = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
            if (mersenneNumber.isProbablePrime(10)) {
                System.out.printf("%d\t%s\n", p, mersenneNumber);
            }
        }
    }
}
