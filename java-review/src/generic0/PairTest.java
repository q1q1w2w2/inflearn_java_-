package review.generic0;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer, String>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair1);
    }
}
