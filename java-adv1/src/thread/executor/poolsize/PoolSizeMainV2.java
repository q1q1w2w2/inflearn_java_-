package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;

public class PoolSizeMainV2 {

    public static void main(String[] args) {
        // 스레드 수 고정, 큐 사이즈 무제한 -> 안정적, CPU와 메모리 리소스 예측 가능

        ExecutorService es = Executors.newFixedThreadPool(2);
//        new ThreadPoolExecutor(2, nThread,
//                0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i < 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }
        es.close();
        log("== shutdown 완료 ==");

    }
}
