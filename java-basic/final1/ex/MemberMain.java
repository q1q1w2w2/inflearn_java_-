package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("User1Id","Kim");
        member.print();
        member.changeData("User2Id", "seo");
        member.print();
    }
}
