package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 생성 시점에 T의 타입을 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(100);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("문자문자");
        String s = stringBox.get();
        System.out.println("s = " + s);

        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.0);
        System.out.println("doubleBox.set() = " + doubleBox.get());

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox1 = new GenericBox<>();
        integerBox1.set(101);
        System.out.println(integerBox1.get());
    }
}
