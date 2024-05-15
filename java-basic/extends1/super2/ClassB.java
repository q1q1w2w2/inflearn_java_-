package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a){
        // super(); // 생략 가능, 기본생성자
        System.out.println("ClassB 생성자");
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 " + a + " " +b);
    }
}
