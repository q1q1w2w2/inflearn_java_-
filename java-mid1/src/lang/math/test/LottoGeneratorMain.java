package lang.math.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNum = lottoGenerator.generator();

        for (int i : lottoNum) {
            System.out.print(i + " ");
        }
    }
}
