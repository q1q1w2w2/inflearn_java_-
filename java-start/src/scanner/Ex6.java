package scanner;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("너의 이름은..? ");
        String name = scanner.nextLine();
        System.out.println("너의 나이는..? ");
        int age = scanner.nextInt();

        System.out.println("너의 이름은 " + name + "이고, 나이는 " + age +"임");
    }
}
