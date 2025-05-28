
public class Lab23 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(numbers);
        stopWatch.stop();

        System.out.println("Время сортировки 100000 чисел: "
                + stopWatch.getElapsedTime() + " мс");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
