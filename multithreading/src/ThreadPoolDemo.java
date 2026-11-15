import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    static void main(String[] args) throws ExecutionException, InterruptedException {
       // ExecutorService pool = Executors.newSingleThreadExecutor(2);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //提交任务
        try {
            Future<Integer> result1 = pool.submit(new SumTask());
            Future<Integer> result2 = pool.submit(new SumTask());
            //取结果
            System.out.println(result1.get());

            //取结果
            System.out.println(result2.get());
        }finally {

            //最终关闭线程池
            pool.shutdown();
        }

    }
}
