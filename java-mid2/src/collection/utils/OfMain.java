package collection.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        // list.add(4); // 불변이라 추가 불가
        System.out.println("list = " + list);

        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        System.out.println("list class = " + list.getClass());
/*
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        System.out.println("list1.getClass() = " + list1.getClass());
        */


    }
}
