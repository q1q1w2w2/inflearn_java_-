package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numArr = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료0)");
        while(true){
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            numArr.add(input);
        }

        int sum = 0;
        for (int i = 0; i < numArr.size(); i++) {
            sum += numArr.get(i);
        }
        System.out.println("입력한 정수의 합계: " + sum);
        double avg = (double) sum / numArr.size();
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
