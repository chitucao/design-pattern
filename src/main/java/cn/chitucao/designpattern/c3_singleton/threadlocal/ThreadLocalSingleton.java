package cn.chitucao.designpattern.c3_singleton.threadlocal;

/**
 * @author DennyFly
 * @since 2020/3/20 14:47
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> TL = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return TL.get();
    }

    // 测试
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(() -> {
            System.out.println(ThreadLocalSingleton.getInstance());
        });
        Thread t2 = new Thread(() -> {
            System.out.println(ThreadLocalSingleton.getInstance());
        });
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
