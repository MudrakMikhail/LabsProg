import java.util.ArrayList;
import java.util.Scanner;

public class ContainerPacking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int n = scanner.nextInt();
        ArrayList<Double> items = new ArrayList<>();
        System.out.print("Введите вес каждого предмета: ");
        for (int i = 0; i < n; i++) {
            double weight = scanner.nextDouble();
            if (weight > 10) {
                System.out.println("Ошибка: Вес одного предмета не может превышать 10 кг.");
                return;
            }
            items.add(weight);
        }

        ArrayList<ArrayList<Double>> containers = new ArrayList<>();

        for (double weight : items) {
            boolean placed = false;

            for (ArrayList<Double> container : containers) {
                double sum = sum(container);
                if (sum + weight <= 10.0) {
                    container.add(weight);
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                ArrayList<Double> newContainer = new ArrayList<>();
                newContainer.add(weight);
                containers.add(newContainer);
            }
        }

        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Контейнер " + (i + 1) + " содержит предметы с весом ");
            ArrayList<Double> container = containers.get(i);
            for (int j = 0; j < container.size(); j++) {
                System.out.print(container.get(j));
                if (j < container.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    private static double sum(ArrayList<Double> list) {
        double total = 0;
        for (double value : list) {
            total += value;
        }
        return total;
    }
}
