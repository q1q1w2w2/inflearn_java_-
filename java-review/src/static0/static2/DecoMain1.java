package review.static0.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String str = "test";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String newStr = decoUtil1.deco(str);
        System.out.println("newStr = " + newStr);
    }
}
