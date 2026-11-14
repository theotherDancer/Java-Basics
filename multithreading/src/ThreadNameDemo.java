import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutionException;
public class ThreadNameDemo {
    static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(Thread.currentThread().getName());
       // PrintTask task = new PrintTask();
        SumTask sumTask = new SumTask();
       // Thread worker = new Thread(task);
        // 包装求和任务，供线程执行，并保存 call() 的返回值。
        FutureTask<Integer> futureTask = new FutureTask<>(sumTask);
        //worker.start();
        Thread worker = new Thread(futureTask);
        worker.setName("支线程1");
        //启动前查询支线程的状态
        System.out.println(worker.getState());
        // 启动工作线程，由它执行求和任务。
        worker.start();
        //查询此时支线程的状态
        Thread.sleep(500);
        System.out.println(worker.getState());

        // 主线程在这里等 worker 执行结束。
        worker.join();
        System.out.println("支线程1已结束");
        //查询支线程的状态
        System.out.println(worker.getState());
        // join() 已等到线程结束，这里直接取回任务结果。
        Integer result = futureTask.get();
        System.out.println(result);
    }
}
