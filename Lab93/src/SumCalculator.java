import java.util.ArrayList;
import java.util.Scanner;

public class SumCalculator {

    public static double sum(ArrayList<Double> list) {
        double total = 0.0;
        for (double value : list) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Введите 5 чисел:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            numbers.add(num);
        }
        double total = sum(numbers);
        System.out.println("Сумма введённых чисел: " + total);
        scanner.close();
    }
}
