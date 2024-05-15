package scanner;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("머 입력해봐 종료는exit");
            String a = scanner.nextLine();

            if(a.equals("exit")){
                System.out.println("응꺼질게");
                break;
            }
            System.out.println("너가쓴거 "+a);
        }

    }
}
