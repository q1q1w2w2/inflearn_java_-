package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //플레이어 켜기
        isOn = true;
        System.out.println("음악플레이어 시작");

        //볼륨 증가
        volume++;
        System.out.println(volume);
        //볼륨 증가
        volume++;
        System.out.println(volume);
        //볼륨 감소
        volume--;
        System.out.println(volume);
        //플레이어 상태
        System.out.println("상태 확인");
        if(isOn){
            System.out.println("플레이어 On " + volume);
        }else{
            System.out.println("플레이어 Off");
        }
        //플레이어 끄기
        isOn = false;
        System.out.println("종료");
    }
}
