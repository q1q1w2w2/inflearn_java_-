package test.enum1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]");
            String grade = scanner.nextLine();
            if (grade.equals("q")) {
                System.out.println("종료합니다");
                break;
            }

            AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
            System.out.println("당신의 등급은 " + authGrade.getDescription());

            System.out.println("== 메뉴 목록 ==");
            if (authGrade.getLevel() > 0) {
                System.out.println("- 메인 화면");
            }
            if (authGrade.getLevel() > 1) {
                System.out.println("- 이메일 관리 화면");
            }
            if (authGrade.getLevel() > 2) {
                System.out.println("- 관리자 화면");
            }

        }


    }
}
