public class BlockedDemo {
    void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                System.out.println("工作线程进来了");
            }
        };

        Thread worker = new Thread(task);



        synchronized (lock) {
            System.out.println("进来了");
            // 主线程已持有 lock 的锁，工作线程要等这把锁释放才能进入自己的同步块。
            worker.start();
            Thread.sleep(500);
            System.out.println(worker.getState());
        }
    }
}