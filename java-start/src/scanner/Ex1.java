package scanner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력행\n");
        String str = scanner.nextLine();
        System.out.println("입력한거: " + str);
//
//        System.out.print("정수 입력행");
//        int intV = scanner.nextInt();
//        System.out.println("입력한거: " + intV);
//
//        System.out.print("실수 입력행");
//        double doubleV = scanner.nextDouble();
//        System.out.println("입력한거: " + doubleV);
    }
}
