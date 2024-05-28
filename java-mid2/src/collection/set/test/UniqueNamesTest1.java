package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        // 중복이 있는 배열
        Integer[] inputArr = {30,20,20,10,10};

        // 중복을 제거하려면? -> Set 사용
        Set<Integer> inputSet = new HashSet<>();
        for (Integer i : inputArr) {
            inputSet.add(i);
        }
        System.out.println("inputSet = " + inputSet);

        for (Integer i : inputSet) {
            System.out.print(i + " ");
        }
    }
}
