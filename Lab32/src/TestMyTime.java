public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000L);
        MyTime time3 = new MyTime(5, 23, 55);
        System.out.println("Текущее время: " + time1);
        System.out.println("Время от миллисекунд: " + time2);
        System.out.println("Время от параметров: " + time3);
    }
}