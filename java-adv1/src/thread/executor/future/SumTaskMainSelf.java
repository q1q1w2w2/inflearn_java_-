package thread.executor.future;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static util.MyLogger.log;

public class SumTaskMainSelf {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(100);
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= 500; i+=50) {
            SumTask sumTask = new SumTask(i, i + 49);
            Future<Integer> future = es.submit(sumTask);
            list.add(future);
        }

        int sum = 0;
        for (Future<Integer> future : list) {
            Integer result = future.get();
            log("result: " + result);
            sum += result;
        }

        log("sum = " + sum);
        log("End");
        es.close();
    }

    static class SumTask implements Callable<Integer> {

        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws InterruptedException {
            log("작업 시작");
            Thread.sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            log("작업 완료 result = " + sum);
            return sum;
        }
    }
}
