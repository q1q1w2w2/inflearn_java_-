package scanner;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수입력해 ㅇㅅㅇ  ");
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("니가쓴거 짝수임 ㅋㅋ");
        }else{
            System.out.println("니가쓴거 홀수임 ㅋㅋ");
        }
    }
}
