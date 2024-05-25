package generic.test.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param){
//        return param instanceof T; // 런타임에 타입을 활용할 수 없음
        return false;
    }

    public void create(){
//        return new T();
    }
}
