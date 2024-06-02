package review.static0.static1;

public class Data3 {
    public String name;
    private static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
