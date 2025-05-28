import java.util.Scanner;

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "Наибольший элемент массива, равный " + maxValue + ", находится в позиции (" + row + ", " + column + ")";
    }
}

public class LargestElementFinder {

    public static Location locateLargest(double[][] a) {
        if (a == null || a.length == 0 || a[0].length == 0) {
            return null; // Проверка на пустой массив
        }

        int maxRow = 0;
        int maxCol = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new Location(maxRow, maxCol, maxValue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строчек и столбцов массива: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location largest = locateLargest(array);

        if (largest != null) {
            System.out.println(largest.toString());
        } else {
            System.out.println("Массив пуст.");
        }

        scanner.close();
    }
}