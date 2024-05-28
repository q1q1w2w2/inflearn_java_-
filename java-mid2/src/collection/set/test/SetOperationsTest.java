package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 두 집합의 합집합, 교집합, 차집합 구하기
        // -> 중복 제거

        // 합집합
        Set<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        // 교집합
        Set<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합: " + intersection);

        // 차집합
        Set<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합: " + difference);

    }
}
