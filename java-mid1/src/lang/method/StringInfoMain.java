package lang.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java";
        System.out.println("문자열 길이: " + str.length());
        System.out.println("문자열 비어있는지: " + str.isEmpty());
        System.out.println("문자열 비어있거나 공백인지: " + str.isBlank());
        System.out.println("문자열 공백인지: " + "    ".isBlank());
        System.out.println("7번 인덱스의 문자 = " + str.charAt(7));
    }
}
