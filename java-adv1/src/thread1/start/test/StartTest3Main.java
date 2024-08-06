package thread1.start.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class StartTest3Main {

    public static void main(String[] args) throws InterruptedException {
        log("main() start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    log("value: " + (i + 1));
                    sleep(500);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

        log("main() end");
    }
}
