package array;

public class Ex4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int sum=0;
        double average=0;
        for(int student:students){
            sum+=student;
        }
        average=sum/students.length;

        System.out.println("점수 합계: "+sum);
        System.out.println("점수 평균: "+average);
    }
}
