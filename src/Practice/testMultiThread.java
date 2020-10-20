package Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author pandaxubo
 *
 * @description 尝试使用线程池
 */
public class testMultiThread extends Thread{
    private final int index;
    public testMultiThread(int i){
        this.index=i;
    }
    public void run(){
        try{
            System.out.println("["+this.index+"] start....");
            Thread.sleep((int)(Math.random()*1000));
            System.out.println("["+this.index+"] end.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ExecutorService service= Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++){
            //service.execute(new testMultiThread(i));
            service.submit(new testMultiThread(i));
        }
        System.out.println("submit finish");
        service.shutdown();
    }
}
