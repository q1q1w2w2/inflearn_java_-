package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        System.out.println("date1 = " + date1);

        System.out.println("date2 -> 2025");
        ImmutableMyDate date2 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("date2 -> 25");
        ImmutableMyDate date3 = date2.withDay(25);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
}
