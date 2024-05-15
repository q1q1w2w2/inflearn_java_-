package array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max=10;
        String[] productNames=new String[max];
        int[] productPrices=new int[max];
        int count=0;

        while(true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");


            int select = scanner.nextInt();
            scanner.nextLine();

            if(select==1){
                if(count>=max) {
                    System.out.println("넘많아");
                    continue;
                }

                System.out.print("상품 이름: ");
                productNames[count] = scanner.nextLine();
                System.out.print("상품 가격: ");
                productPrices[count] = scanner.nextInt();
                System.out.println(count);
                count++;

            }else if(select==2){
                if(count==0){
                    System.out.println("상품없엉");
                    continue;
                }
                for(int i=0;i<count;i++){
                    System.out.println(productNames[i]+" : "+productPrices[i]);
                }
            }else if(select==3){
                System.out.println("종료~");
                break;
            }else{
                System.out.println("이거아니야ㅡㅡ");
            }
        }


    }
}
