package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 1회 할당 가능
//        data1 = 19; // 이후로는 변경 불가능

        final int data2 = 10;

        method(10);
    }

    private static void method(final int parameter) {
        int a = parameter *2;
        System.out.println(a);
    }
}
