import java.util.ArrayList;

public class MaxFinder {

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Введите последовательность целых чисел (введите 0 для окончания ввода):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        Integer maximum = max(numbers);

        if (maximum != null) {
            System.out.println("Наибольшее значение: " + maximum);
        } else {
            System.out.println("Список пуст.");
        }

        scanner.close();
    }
}
