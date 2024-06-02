package review.static0.staticTest;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
//        MathArrayUtils mathArrayUtils = new MathArrayUtils();
//        System.out.println("sum = " + mathArrayUtils.sum(values));
        System.out.println("sum = " + MathArrayUtils.sum(values));
        System.out.println("average = " + MathArrayUtils.average(values));
        System.out.println("min = " + MathArrayUtils.min(values));
        System.out.println("max = " + MathArrayUtils.max(values));
    }
}
