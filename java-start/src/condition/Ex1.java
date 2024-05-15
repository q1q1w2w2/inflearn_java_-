package condition;

public class Ex1 {
    public static void main(String[] args) {
        char grade='B';

        switch (grade){
            case 'A':
                System.out.println("탁월");
                break;
            case 'B':
                System.out.println("좋음");
                break;
            case 'C':
                System.out.println("준수");
                break;
            case 'D':
                System.out.println("향상하셈");
                break;
            case 'F':
                System.out.println("불합");
                break;
            default:
                System.out.println("노력하셈");


        }
    }
}
