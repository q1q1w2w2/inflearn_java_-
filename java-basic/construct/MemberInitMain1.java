package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 80);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 17, 88);

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println(m.name+" "+m.age+" "+m.grade);
        }

    }

}
