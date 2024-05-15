package scanner;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력해에에ㅔ : ");
        int a = scanner.nextInt();

        System.out.print("하나더입력해에에ㅔ : ");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("더큰거 이거야"+a);
        }else if(a<b){
            System.out.println("더큰거 이거야"+b);
        }else{
            System.out.println("똑같다");
        }
    }
}
