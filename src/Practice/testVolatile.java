package Practice;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pandaxubo
 *
 * @description 对volatile关键字的尝试。
 *
 * 结论：在多线程环境下，有可能线程A将num读取到本地内存中，此时其他线程可能已经将num增大了很多，
 * 线程A依然对过期的num进行自加，重新写到主存中，最终导致了num的结果不合预期，而是小于30000。
 */
public class testVolatile {
    //使用原子操作类
    public static AtomicInteger num = new AtomicInteger(0);
    //public static volatile int num = 0;
    //使用CountDownLatch来等待计算线程执行完
    static CountDownLatch countDownLatch = new CountDownLatch(30);
    public static void main(String []args) throws InterruptedException {
        //开启30个线程进行累加操作
        for(int i=0;i<30;i++){
            new Thread(() -> {
                for(int j=0;j<10000;j++){
                    //num++;//自加操作
                    num.incrementAndGet();
                }
                countDownLatch.countDown();
            }).start();
        }
        //等待计算线程执行完
        countDownLatch.await();
        System.out.println(num);
    }
}
