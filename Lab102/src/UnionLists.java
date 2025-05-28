import java.util.ArrayList;
import java.util.Scanner;

public class UnionLists {

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Введите пять целых чисел для списка1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Введите пять целых чисел для списка2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> mergedList = union(list1, list2);

        System.out.print("Объединенный список равен ");
        for (int i = 0; i < mergedList.size(); i++) {
            System.out.print(mergedList.get(i));
            if (i < mergedList.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
