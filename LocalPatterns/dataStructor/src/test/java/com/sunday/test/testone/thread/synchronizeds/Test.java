package com.sunday.test.testone.thread.synchronizeds;


public class Test {


    /**
     * 调用run方法也会打印hello，但是不会启动一个新的执行流
     *
     */
    @org.junit.Test
    public void  test() throws InterruptedException {
//        HelloRunnable helloThread = new HelloRunnable();
//        Thread  thread = new Thread(helloThread);
//        thread.start();
//

//        List<String>  datas = new ArrayList<>();
//         Thread t1 = new ShareMemoryDemo.ChildThread(datas);
//         Thread t2 = new ShareMemoryDemo.ChildThread(datas);
//
//         t1.start();
//         t2.start();
//         t1.join();
//         t2.join();
//
//         System.out.println(ShareMemoryDemo.shared);
//         System.out.println(datas);


//           int num = 1000;
//           Thread[] threads =  new Thread[num];
//
//        for (int i = 0; i < num; i++){
//              threads[i] = new CounterThread();
//              threads[i].start();
//
//        }
//

//         //内存可见性
//          new VisibilityDemo.HelloThread().start();
//          Thread.sleep(1000);
//          VisibilityDemo.shutdone = true;
//        System.out.println("exit main");



//        int num = 1000;
////        Thread[] threads =  new Thread[num];
////        Counter counter = new Counter();
////        for (int i = 0; i < num; i++){
////            threads[i] = new CounterThreadTwee(counter);
////            threads[i].start();
////
////        }
////        for (int i = 0; i < num; i++){
////            threads[i].join();
////
////        }
////        System.out.println(counter.getCount());


         DeakLockDemo.startThreadA();
         DeakLockDemo.startThreadB();
     }
}
