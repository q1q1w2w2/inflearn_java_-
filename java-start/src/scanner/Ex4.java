package scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("둘다 0이면 꺼질게~");
            System.out.print("숫자쓰셈~");
            int a = scanner.nextInt();
            System.out.print("하나더쓰셈~");
            int b = scanner.nextInt();
            int sum = a + b;
            if (a == 0 && b == 0) {
                System.out.println("응꺼질게~");
                break;
            }
            System.out.println(a + b);
        }
    }
}
