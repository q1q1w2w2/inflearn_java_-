package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);

        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.2);
        String s = GenericMethod.<String>genericMethod("hello");

        // 매개변수 보고 알아서 타입 추론함
        System.out.println("타입 추론");
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.2);
        String s1 = GenericMethod.genericMethod("hello");


    }
}
