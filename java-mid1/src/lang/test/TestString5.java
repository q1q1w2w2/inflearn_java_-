package lang.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println(str.substring(0, str.indexOf(ext)));
        System.out.println(str.substring(str.indexOf(ext)));
    }
}
