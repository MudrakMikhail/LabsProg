import java.util.Random;

public class Lab21 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        System.out.println("50 случайных чисел от 0 до 100:");
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
    }
}
