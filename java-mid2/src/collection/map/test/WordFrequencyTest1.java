package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");
        System.out.println(Arrays.toString(textArr));

        Map<String, Integer> fruit = new HashMap<>();
//        for (String s : textArr) {
//            // map에 없다면 추가, 있다면 +1
//            if(fruit.containsKey(s)){
//                fruit.put(s, fruit.get(s)+1);
//            }else{
//                fruit.put(s, 1);
//            }
//        }

//        for (String s : textArr) {
//            Integer count = fruit.get(s);
//            if(count == null){
//                count = 0;
//            }
//            count++;
//            fruit.put(s, count);
//        }

        for (String s : textArr) {
            fruit.put(s, fruit.getOrDefault(s, 0) + 1);
        }

        System.out.println(fruit);
    }
}
