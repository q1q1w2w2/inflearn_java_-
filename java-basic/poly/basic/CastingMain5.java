package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        System.out.println("parent1 호출");
        call(parent1);
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        if(parent instanceof Child){ // Child인스턴스면
            System.out.println("Child instance");
            Child child = (Child) parent;
            child.childMethod();
        }else{
            System.out.println("Child instance 아님");
        }
    }
}
