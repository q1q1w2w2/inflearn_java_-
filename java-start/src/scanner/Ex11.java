package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;

        while(true){
            System.out.println("1: 장바구니, 2: 결제, 3: 프로그램 종료");
            int a = scanner.nextInt();

            if(a==1){
                scanner.nextLine();

                System.out.print("상품명입력: ");
                String name = scanner.nextLine();

                System.out.print("가격입력: ");
                int price = scanner.nextInt();

                System.out.print("구매수량: ");
                int qu = scanner.nextInt();

                System.out.println("상품명: "+name+"가격: "+price+"수량: "+qu);
                sum+=price*qu;
            }else if(a==2){
                System.out.println("음..다해서 "+sum+"야");
                sum=0;
            }else if(a==3){
                System.out.println("종료종료~");
                break;
            }else{
                System.out.println("야 이거아닌거알자나ㅡㅡ");
            }
        }
    }
}
