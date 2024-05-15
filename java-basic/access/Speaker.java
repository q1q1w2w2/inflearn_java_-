package access;

import com.helloshop.product.Product;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량 증가 안됨 100초과 ㄴㄴ");
        }else{
            volume+=10;
            System.out.println("음량 10 증가");
        }
    }
    void volumeDown(){
        volume-=10;
        System.out.println("음량 10 감소");
    }
    void showVolume(){
        System.out.println("현재 음량: "+volume);
    }
}
