package lang.math.test1;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lotto = lottoGenerator.generator();
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}
