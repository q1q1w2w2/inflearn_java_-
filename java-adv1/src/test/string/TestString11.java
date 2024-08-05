package test.string;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println("reverse = " + reverse);
    }
}
