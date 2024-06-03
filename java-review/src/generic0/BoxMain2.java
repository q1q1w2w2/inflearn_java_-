package review.generic0;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        System.out.println("integerBox = " + integerBox.get());
        Class<?> aClass = integerBox.get().getClass();
        System.out.println("aClass = " + aClass);
    }
}
