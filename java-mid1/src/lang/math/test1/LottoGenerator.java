package lang.math.test1;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumber;

    public int[] generator(){
        lottoNumber = new int[6];

        for(int i=0; i<lottoNumber.length; i++){
            int number = random.nextInt(45) + 1;
            if(isUnique(number)){
                lottoNumber[i] = number;
            }
        }

        return lottoNumber;
    }

    private boolean isUnique(int num){
        for (int i=0; i<lottoNumber.length; i++) {
            if(lottoNumber[i]==num){
                return false;
            }
        }
        return true;
    }
}
