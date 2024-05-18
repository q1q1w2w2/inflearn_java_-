package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1);
        MyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        // 여기서 의도한 바는 date1의 year을 2025로 변경하려고 함
        // 근데 date1은 date2를 참조하므로 둘다 바뀜
        // 불변 객체 활용
    }
}
