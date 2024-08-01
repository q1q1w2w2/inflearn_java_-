package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockBad implements SpinLock {

    private volatile boolean lock = false;

    @Override
    public void lock() {
        log("락 획득 시도");
        while (true) {
            // 1번과 2번으로 연산이 나누어져 있음 -> 원자적 연산이 아님 -> 문제 발생
            if (!lock) { // 1. 락 사용 여부 확인
                sleep(100);
                lock = true; // 2. 락의 값 변경
                break;
            } else {
                // 락을 획득할 때 까지 스핀 대기
                log("락 획득 실패 - 스핀 대기");
            }
        }
        log("락 획득 완료");
    }

    @Override
    public void unlock() {
        lock = false;
        log("락 반납 완료");
    }
}
