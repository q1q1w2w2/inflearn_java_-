package thread1.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) throws InterruptedException {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        log("main() end");

    }
}
