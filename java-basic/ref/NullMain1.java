package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println(data);
        data = new Data();
        data.value=10;
        System.out.println(data);
        System.out.println(data.value);
        data = null;
        System.out.println(data);
    }
}
