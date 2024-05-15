package array;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num;
        num=new int[5];

        System.out.println("5개의 정수 입력행: ");
        for(int i=0;i< num.length;i++){
            num[i] = scanner.nextInt();
        }

        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }


    }
}
