package thread1.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static util.MyLogger.log;

public abstract class ExecutorUtils {

    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queueTasks = poolExecutor.getQueue().size();
            long completedTasks = poolExecutor.getCompletedTaskCount();
            log("[pool=" + pool + ", active=" + active + ", queueTasks=" + queueTasks + ", completedTasks=" + completedTasks + "]");
        } else {
            log(executorService);
        }
    }
}
