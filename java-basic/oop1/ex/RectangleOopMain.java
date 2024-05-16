package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.height=10;
        r.width=10;
        System.out.println(r.area()+" "+ r.perimeter()+" "+r.square());
    }
}
