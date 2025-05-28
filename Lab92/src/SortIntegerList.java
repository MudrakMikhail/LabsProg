import java.util.ArrayList;
import java.util.Scanner;

public class SortIntegerList {
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введите 5 целых чисел:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        sort(numbers);
        System.out.println("Числа в порядке возрастания:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
