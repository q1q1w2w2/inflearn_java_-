package thread1.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static thread1.executor.ExecutorUtils.printState;
import static util.MyLogger.log;

public class ExecutorShutdownMain {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("longTask", 100_000));
        printState(es);
        log("== shutdown 시작 ==");
        shutdownAndAwaitTermination(es);
        log("== shutdown 완료");
        printState(es);
    }

    static void shutdownAndAwaitTermination(ExecutorService es) {
        es.shutdown(); // non-blocking, 새로운 작업 안받음, 처리중이거나 대기중인거만 처리

        try {
            log("서비스 정상 종료 시도");
            if (!es.awaitTermination(10, TimeUnit.SECONDS)) {
                log("서비스 정상 종료 실패 -> 강제 종료 시도");
                es.shutdownNow();
                if (!es.awaitTermination(10, TimeUnit.SECONDS)) {
                    log("서비스가 종료되지 않았습니다");
                }
            }
        } catch (InterruptedException e) {
            es.shutdownNow();
        }
    }
}
