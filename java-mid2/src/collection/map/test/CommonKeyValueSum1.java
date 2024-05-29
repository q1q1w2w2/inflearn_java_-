package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 공통 키 찾고, 값의 합 구하기
        Map<String, Integer> result = new HashMap<>();

        for (String s : map1.keySet()) {
            if (map2.containsKey(s)){
                System.out.println("map1.get(s) + map2.get(s) = " + (map1.get(s) + map2.get(s)));
                result.put(s, (map1.get(s) + map2.get(s)));
            }
        }
        System.out.println(result);

    }
}
