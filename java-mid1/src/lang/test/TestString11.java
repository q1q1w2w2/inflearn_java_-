package lang.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        String reversedStr = new StringBuilder(str).reverse().toString();

        System.out.println(reversedStr);
    }
}
