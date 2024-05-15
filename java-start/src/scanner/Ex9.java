package scanner;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
