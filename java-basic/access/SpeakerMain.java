package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 직접 접근 -> private 사용해서 방지
//        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
