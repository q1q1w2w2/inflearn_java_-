package method;

public class Ex3 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 3);
    }
    public static void printMessage(String message, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}