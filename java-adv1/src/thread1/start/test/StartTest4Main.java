package thread1.start.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {

        MyRunnable runnableA = new MyRunnable("A", 1000);
        MyRunnable runnableB = new MyRunnable("B", 500);

        Thread threadA = new Thread(runnableA, "Thread-A");
        Thread threadB = new Thread(runnableB, "Thread-B");
        threadA.start();
        threadB.start();
    }

    static class MyRunnable implements Runnable {

        private final String name;
        private final int sleep;

        public MyRunnable(String name, int sleep) {
            this.name = name;
            this.sleep = sleep;
        }

        @Override
        public void run() {
            while (true) {
                log(name);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
