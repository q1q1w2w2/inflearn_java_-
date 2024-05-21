package nested.nested;

public class NetsedOuterMain {
    public static void main(String[] args) {
        NestedOuter nestedOuter = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
