import java.util.Calendar;
import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;  // 0-based (январь = 0)
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
