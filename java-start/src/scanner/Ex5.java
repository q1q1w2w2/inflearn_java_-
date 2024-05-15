package scanner;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("숫자쓰세영: ");
            int a = scanner.nextInt();
            sum+=a;
            if(a==0){
                System.out.println("다더한거 이거영: "+ sum);
                break;
            }
        }
    }
}
