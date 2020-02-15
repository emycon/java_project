public class ThreadLocalDemo {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();

        new Thread(threadDemo).start();
        new Thread(threadDemo).start();
    }
}

class ThreadDemo implements Runnable {
    // private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
    private Integer integer = 0;

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            // Integer integer = threadLocal.get();
            // integer += 1;
            integer++;
            // threadLocal.set(integer);
            System.out.println(integer);
        }
    }
}