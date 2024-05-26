package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        BatchProcessor processor1 = new BatchProcessor(list1);
        processor1.logic(50_000);
    }
}
