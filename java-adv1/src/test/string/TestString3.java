package test.string;

public class TestString3 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String findText = ".txt";

        int startNum = str.indexOf(findText);
        System.out.println(startNum);

        char c = str.charAt(5);
        System.out.println("c = " + c);
    }
}
