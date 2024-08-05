package test.string;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0, str.indexOf("."));
        System.out.println("filename = " + filename);
        String extName = str.substring(str.indexOf("."));
        System.out.println("extName = " + extName);

    }
}
