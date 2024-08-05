package test.string;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);


        while (index >= 0) {
            System.out.println("index = " + index);
            index = str.indexOf(key, index + key.length());
            count++;
        }

        System.out.println("count = " + count);
    }
}
