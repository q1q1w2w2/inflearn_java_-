package scanner;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자하나~ ");
        int a = scanner.nextInt();
        System.out.println("숫자둘~ ");
        int b = scanner.nextInt();

        if(a>b){
            int temp;
            temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i<=b;i++){
            System.out.print(i);
            if(i!=b){
                System.out.print(",");
            }
        }
    }
}
