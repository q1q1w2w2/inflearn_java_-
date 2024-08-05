package test.string;

public class TestString8 {

    public static void main(String[] args) {
        String input = "Hello java spring jpa java";
        System.out.println("input = " + input);
        String replace = input.replace("java", "jvm");
        System.out.println("replace = " + replace);
    }
}
