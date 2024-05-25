package generic.test.ex1;

public class Container<T> {
    private T item;

    public void setValue(T value) {
        this.item = value;
    }

    public T getValue() {
        return item;
    }

    public boolean isEmpty(){
        return item==null;
    }
}
