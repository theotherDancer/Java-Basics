import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {
    @Override
    public Integer call () throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        //打印线程状态
        System.out.println(Thread.currentThread().getState());
        // 暂停当前执行 call() 的工作线程约两秒。
        Thread.sleep(2000);
        // 算出 1 到 10 的总和，再 return 这个结果
        Integer sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
        }
        return sum;
    }
}