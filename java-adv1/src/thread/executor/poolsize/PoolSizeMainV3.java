package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV3 {

    public static void main(String[] args) {
        // 초과 스레드만 사용, 작업 요청이 오면 초과 스레드로 바로바로 처리, 60초간 생존
        // 서버 자원을 최대한 사용, 서버가 감당할 수 있는 임계점 넘으면 다운 가능성
        ExecutorService es = Executors.newCachedThreadPool();
//        ExecutorService es = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                60L, TimeUnit.SECONDS, new SynchronousQueue<>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i < 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }
        log("== 작업 수행 완료 ==");

        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(es);

        es.close();
        log("== shutdown 완료 ==");
        printState(es);

    }
}
