package Static2.ex;

import java.lang.reflect.Array;

public class MathArrayUtils {
    private MathArrayUtils(){
        // 인스턴스 생성 막아버리기
    }

    public static int sum(int[] values){
        int total = 0;
        for (int i : values) {
            total += i;
        }
        return total;
    }

    public static double average(int[] values){
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values){
        int min = values[0];
        for (int i : values) {
            if(min>i){
                min=i;
            }
        }
        return min;

    }
}
