package review.enum3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());

        System.out.println(Integer.toHexString(System.identityHashCode(Grade.BASIC)));

    }
}
