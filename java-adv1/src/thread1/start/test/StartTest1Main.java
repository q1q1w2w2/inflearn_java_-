package thread1.start.test;

import static util.MyLogger.log;


public class StartTest1Main {

    public static void main(String[] args) throws InterruptedException {
        log("main() start");

        CounterThread thread = new CounterThread();
        thread.start();
        thread.join();

        log("main() end");
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                log("value: " + (i + 1));
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
