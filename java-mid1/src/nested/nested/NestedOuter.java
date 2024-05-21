package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print(){
            // 자신의 객체에 접근
            System.out.println(nestedInstanceValue);

            // 외부 클래스의 인스턴스 멤버에는 접근 x
            // System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에는 접근 가능, private도
            System.out.println(outClassValue);
        }
    }

}
