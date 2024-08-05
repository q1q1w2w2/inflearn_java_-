package test.string;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        String filename = str.substring(0, extIndex);
        System.out.println("filename = " + filename);
        String extName = str.substring(extIndex);
        System.out.println("extName = " + extName);

    }
}
