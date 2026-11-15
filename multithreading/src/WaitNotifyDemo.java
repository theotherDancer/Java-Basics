public class WaitNotifyDemo {
   static Object lock= new Object();
   static boolean hasData=false;

   //方法里按这个顺序写：
    //1. 用 synchronized (lock) 拿到共享锁。
    //2. 在同步块里用 while (!hasData) 检查有没有数据。没有就调用 lock.wait()，醒来后再检查。
    //3. 走出 while 说明有数据了。还在同步块里，
    // 把 hasData 改成 false，然后打印「消费者取走了数据」。这个练习用布尔值模拟数据被取走。
   private static void consume() throws InterruptedException {
       // 把你写好的整个 synchronized 块放在这里
       synchronized (lock){
           while (!hasData){
               lock.wait();
           }
        hasData=false;
        System.out.println("消费者取走了数据");
    }
   }
   //生产者开始：
    //    用 synchronized (lock) 拿到和消费者共用的锁
    //        把 hasData 改成 true，表示放入了一份数据
    //        打印「生产者放入了数据」
    //        调用 lock.notify()，通知正在等待的消费者
    //    退出同步块，释放锁
   private static void produce() {
       synchronized (lock){
           hasData=true;
           System.out.println("生产者放入了数据");
           lock.notify();
       }
   }

    static void main(String[] args) throws InterruptedException {
      //消费者线程
        Thread consumer = new Thread(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        //剩下的按你之前写 CounterDemo 的方式接上：
        //1. 创建 producer 线程，任务写成 () -> produce()。
        //2. 调用 consumer.start()。
        // 用 while (consumer.getState() != Thread.State.WAITING) 等它进入等待状态，
        // 循环体里写 Thread.sleep(10)。
        //3. 出了循环就打印「消费者已进入 WAITING」，再调用 producer.start()。
        //4. 对两个线程都调用 join()，让主线程等它们结束。
        Runnable task = () -> produce();
        Thread producer = new Thread(task);
        consumer.start();
        while (consumer.getState() != Thread.State.WAITING){
            Thread.sleep(10);
        }
        System.out.println("消费者已进入WAITING");
        producer.start();
        consumer.join();
        producer.join();
    }
}
