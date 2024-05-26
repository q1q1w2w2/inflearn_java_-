package collection.list.test.ex1;

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {
        System.out.println("==ArrayList 사용==");
        ArrayList<Integer> students1 = new ArrayList<>();
        students1.add(90);
        students1.add(80);
        students1.add(70);
        students1.add(60);
        students1.add(50);
        System.out.println(students1);

        int sum = 0;
//        for (Integer i : students1) {
//            sum += i;
//        }
        for (int i = 0; i < students1.size(); i++) {
            sum+=students1.get(i);
        }
        double avg = (double) sum / students1.size();
        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + avg);
    }
}
