package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.parentMethod();
        //다운캐스팅(부모타입->자식타입)
//        Child child = (Child)poly;
//        child.childMethod();

        ((Child)poly).childMethod();
    }
}
