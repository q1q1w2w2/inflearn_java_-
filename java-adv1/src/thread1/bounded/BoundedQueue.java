package thread1.bounded;

public interface BoundedQueue {
    void put(String data); // 버퍼에 데이터 보관(생산자)

    String take(); // 버퍼에 보관된 값을 반환(소비자)
}
