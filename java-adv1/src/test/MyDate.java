package test;

public class MyDate {

    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate newYear(int newYear) {
        return new MyDate(newYear, month, day);
    }

    public MyDate newMonth(int newMonth) {
        return new MyDate(year, newMonth, day);
    }

    public MyDate newDay(int newDay) {
        return new MyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
