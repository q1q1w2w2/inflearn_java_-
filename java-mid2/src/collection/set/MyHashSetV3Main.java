package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        MySet<Integer> set1 = new MyHashSetV3<>(10);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(11);
        System.out.println(set1);
    }
}
