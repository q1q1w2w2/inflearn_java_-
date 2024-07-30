package thread.sync.test;

import util.ThreadUtils;

import static util.MyLogger.log;

public class SyncTest1Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 = new Thread(task, "t1");
        Thread thread2 = new Thread(task, "t2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("결과: " + counter.getCount());
    }

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count = count + 1;
        }

        public synchronized int getCount() {
            return count;
        }
    }
}
