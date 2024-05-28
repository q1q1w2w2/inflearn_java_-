package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        // 중복이 있는 배열
        Integer[] inputArr = {30,20,20,10,10};

        // 중복을 제거 + 입력 순서 유지 -> LinkedHashSet?
        Set<Integer> inputSet = new LinkedHashSet<>(List.of(inputArr));

        System.out.println("inputSet = " + inputSet);

        for (Integer i : inputSet) {
            System.out.print(i + " ");
        }
    }
}
