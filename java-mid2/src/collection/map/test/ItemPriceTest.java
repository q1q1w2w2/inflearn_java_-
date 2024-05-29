package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 값이 1000원인 상품만 출력
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("entry.getValue() = " + entry.getValue());
            if(entry.getValue() == 1000){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
