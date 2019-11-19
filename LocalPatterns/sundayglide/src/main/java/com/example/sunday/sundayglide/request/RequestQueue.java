package com.example.sunday.sundayglide.request;

import android.util.Log;

import com.example.sunday.sundayglide.loader.Loader;
import com.example.sunday.sundayglide.policy.LoaderPolicy;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestQueue {

     /**
      *  阻塞式队列
      *  多线程共享
      *  生产效率和消费 相差太远
      *
      *
      *  使用优先级队列
      *  优先级高的队列先被消费
      *
      */
     private BlockingQueue<BitmapRequest>  requestQueue = new PriorityBlockingQueue<>();


     /**
      * 转发器的数量
      */
     private int threadCount;

     private LoaderPolicy loaderPolicy;

     private AtomicInteger  i = new AtomicInteger(0);

     private RequestfDispatcher dispatcher [];

     public RequestQueue(int threadCount){
          this.threadCount = threadCount;
     }

     public void addRequest(BitmapRequest request){
          if (!requestQueue.contains(request)) {
               request.setSerialNo(i.incrementAndGet());
               requestQueue.add(request);
          }else {
               Log.i("queu","编号已经存在：" + request.getSerialNo());
          }
     }

     public void start(){
          stop();
          startDispatchers();
     }

     private void startDispatchers() {

          dispatcher  = new RequestfDispatcher[threadCount];

          for (int i =0; i < threadCount; i++){
               RequestfDispatcher  dispatcher1 = new RequestfDispatcher(requestQueue);
               dispatcher[i] = dispatcher1;
               dispatcher[i].start();

          }

     }

     private void stop() {

     }


}
