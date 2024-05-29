package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> book = new HashMap<>();
        for (String[] s : productArr) {
            book.put(s[0], Integer.valueOf(s[1]));
        }
        System.out.println("book = " + book);

        for (String s : book.keySet()) {
            System.out.println("제품: " + s + ", 가격: " + book.get(s));
        }
    }
}
