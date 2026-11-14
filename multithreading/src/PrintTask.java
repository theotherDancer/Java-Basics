public class PrintTask implements Runnable {
    @Override
    public void run() {
        // 由你填入打印当前线程名的那一行
        System.out.println(Thread.currentThread().getName());
    }
}