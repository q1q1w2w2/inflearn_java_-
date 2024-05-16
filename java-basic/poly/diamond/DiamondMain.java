package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.methodA();
//        child.methodB();
//        child.methodCommon();
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

    }
}
