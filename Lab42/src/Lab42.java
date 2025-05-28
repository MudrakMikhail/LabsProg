import java.math.BigInteger;

public class Lab42 {
    public static void main(String[] args) {
        BigInteger start = BigInteger.TEN.pow(49);
        int count = 0;
        int requiredCount = 10;

        System.out.println("Первые " + requiredCount + " 50-значных чисел, кратных 2 или 3:");
        while (count < requiredCount) {
            if (start.mod(BigInteger.TWO).equals(BigInteger.ZERO) ||
                    start.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {

                System.out.println(start);
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
    }
}
