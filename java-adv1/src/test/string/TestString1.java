package test.string;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");
        System.out.println("result = " + result);
    }
}