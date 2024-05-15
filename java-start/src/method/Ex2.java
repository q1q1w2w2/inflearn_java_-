package method;

public class Ex2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("평균값: " + average(a,b,c));

        int x = 15;
        int y = 25;
        int z = 35;
        System.out.println("평균값: " + average(x,y,z));
    }

    public static double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }
}
