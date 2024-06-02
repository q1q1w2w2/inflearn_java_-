package review.enumTest;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int input = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(input);
        
        if(status != null){
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        } else {
            System.out.println("정의되지 않은 코드1");
        }

    }
}
