package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        // HashSet은 hash코드 값의 순서대로
        // LinkedHashSet은 입력 순서 보장
        // TreeSet은 값 자체의 순서
        run(new HashSet<String>());
        run(new LinkedHashSet<String>());
        run(new TreeSet<String>());
    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
