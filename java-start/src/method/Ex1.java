package method;

public class Ex1 {
    public static void main(String[] args) {
        int result1 = add(3,5);
        System.out.println(result1);
        int result2 = add(3,4);
        System.out.println(result2);
    }

    public static int add(int a, int b){
        System.out.println(a + " + " + b + " 연산 수행 ");
        int sum = a + b;
        return sum;
    }
}
