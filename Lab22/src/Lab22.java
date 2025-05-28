import java.util.GregorianCalendar;

public class Lab22 {
    public static void main(String[] args) {

        GregorianCalendar currentDate = new GregorianCalendar();
        System.out.println("Текущая дата:");
        printDate(currentDate);

        GregorianCalendar customDate = new GregorianCalendar();
        customDate.setTimeInMillis(1234567898765L);
        System.out.println("\nДата для 1234567898765L:");
        printDate(customDate);
    }

    private static void printDate(GregorianCalendar calendar) {
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day);
    }
}
