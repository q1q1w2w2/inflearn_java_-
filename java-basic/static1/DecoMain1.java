package static1;

public class DecoMain1 {
    public static void main(String[] args) {
        String s ="hello Java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println(s);
        System.out.println(deco);
    }
}
