import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class MatrixWithMaxOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2); // 0 или 1
            }
        }

        System.out.println("Матрица со случайными значениями равна");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val);
            }
            System.out.println();
        }

        List<Integer> maxRowIndices = new ArrayList<>();
        int maxRowCount = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                count += matrix[i][j];
            }

            if (count > maxRowCount) {
                maxRowCount = count;
                maxRowIndices.clear();
                maxRowIndices.add(i);
            } else if (count == maxRowCount) {
                maxRowIndices.add(i);
            }
        }

        List<Integer> maxColIndices = new ArrayList<>();
        int maxColCount = -1;

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += matrix[i][j];
            }

            if (count > maxColCount) {
                maxColCount = count;
                maxColIndices.clear();
                maxColIndices.add(j);
            } else if (count == maxColCount) {
                maxColIndices.add(j);
            }
        }

        System.out.println("Индекс(ы) строчки(ек) с наибольшим кол-вом единиц: " + formatList(maxRowIndices));
        System.out.println("Индекс(ы) столбца(ов) с наибольшим кол-вом единиц: " + formatList(maxColIndices));

        scanner.close();
    }

    private static String formatList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
