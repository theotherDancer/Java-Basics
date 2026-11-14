 public class PrintThread extends Thread {
        @Override
        public void run() {
            // 在这里打印当前线程的名字
            System.out.println(Thread.currentThread().getName());
        }
    }

