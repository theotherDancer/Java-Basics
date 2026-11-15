public class CounterDemo {
    static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            // 用 for 循环调用 counter.increment() 100_000 次
            for(int i=0;i<100000;i++){
                counter.increment();
            }
        };
        //创建两个线程
        Thread threadA = new Thread(task);
        threadA.setName("线程A");
        Thread threadB = new Thread(task);
        threadB.setName("线程B");
        //支线程开始（如果用run方法则是主线程运行，不管是写的是谁）
        threadA.start();
        threadB.start();
        //主线程等两个支线程结束再打印值
        threadA.join();
        threadB.join();
        System.out.println(counter.count);

    }
}
