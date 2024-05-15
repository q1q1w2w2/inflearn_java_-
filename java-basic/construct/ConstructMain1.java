package construct;

import java.lang.reflect.Member;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16,92);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적:" + m.grade);
        }

    }
}
