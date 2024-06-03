package review.generic0;

public class GenericTestMain {
    public static void main(String[] args) {
        GenericTest<String, Integer> test = new GenericTest<>("테스트1", 100);

//        test.setKey("테스트2");
//        test.setValue(200);

        System.out.println(test.getKey() + " " + test.getValue());
    }
}
