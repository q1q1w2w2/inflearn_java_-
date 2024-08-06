package thread1.start.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class StartTest2Main {

    public static void main(String[] args) throws InterruptedException {
        log("main() start");

        CounterRunnable runnable = new CounterRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

        log("main() end");
    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                log("value: " + (i + 1));
                sleep(1000);
            }
        }
    }
}
