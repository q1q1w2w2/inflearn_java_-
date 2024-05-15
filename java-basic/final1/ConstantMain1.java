package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("최대 참여자 수: " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int i) {
        System.out.println("참여자 수: " + i);
        if(i > 1000){
            System.out.println("대기자로 등록됨");
        }else{
            System.out.println("게임에 참가됨");
        }
    }
}
