package review.static0.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String str = "test";
//        DecoUtil2 decoUtil2 = new DecoUtil2();
//        String newStr = decoUtil2.deco(str);
//        System.out.println("newStr = " + newStr);

        String newStr = DecoUtil2.deco(str);
        System.out.println("newStr = " + newStr);

        // DecoUtil2의 deco 메서드에 static 을 사용하여 인스턴스 생성 없이 메서드를 사용함
        // 멤버 변수를 사용하지 않고 단순히 return 만 하는 메서드이기 때문에 static 을 사용하는게 더 나음
    }
}
