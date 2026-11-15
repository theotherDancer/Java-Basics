import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int count=0;
    private final Lock lock = new ReentrantLock();

    void increment(){
        // 获取这个 Counter 持有的 ReentrantLock

         lock.lock();
         try {
             count++;
         }
         finally {
         lock.unlock();
         }
    }

}
