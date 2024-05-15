package scanner;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇단할까? ");
        int n = scanner.nextInt();
        System.out.println(n+"단 구구단:");

        for(int i=1;i<10;i++){
            System.out.println(n+"*"+i+"="+ n*i);
        }
    }
}
