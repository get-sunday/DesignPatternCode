package com.sunday.test.testone.thread.wait;


import com.sunday.test.testone.thread.synchronizeds.CounterThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Test {


    /**
     * 调用run方法也会打印hello，但是不会启动一个新的执行流
     *
     */
    @org.junit.Test
    public void  test() throws InterruptedException {

//         WaitThread waitThread = new WaitThread();
//         waitThread.start();
//         Thread.sleep(1000);
//         System.out.println("fire");
//         waitThread.fire();

           //生产者消费者模式
//           MyBlockingQueue<String> queue =new MyBlockingQueue<>(10);
//           new Producer(queue).start();
//           new Consumer(queue).start();

           //同时开始
//            int num = 10;
//            FireFlag fireFlag = new FireFlag();
//            Thread [] threads = new Thread[num];
//         for (int i = 0; i < num; i++){
//              threads[i] = new Racer(fireFlag);
//              threads[i].start();
//        }
//         Thread.sleep(1000);
//         fireFlag.fire();

           //await
//        ExecutorService executorService = Executor.
     }

     @org.junit.Test
     public void  testThreadLocal() throws InterruptedException {
          final ThreadLocal<Integer> local = new ThreadLocal<>();
           Thread childThread = new Thread(){
               @Override
               public void run() {

                     System.out.println("child thread initial: "+ local.get() );
                     local.set(200);
                    System.out.println("child thread initial: "+ local.get() );
               }
           };
           local.set(100);
           childThread.start();
           childThread.join();
           System.out.println("child thread initial: "+ local.get() );
     }

}
