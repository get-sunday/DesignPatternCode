package com.sunday.test.testone.thread.synchronizeds;

public class DeakLockDemo {

    static Object lockA = new Object();
    static Object lockB = new Object();


    static void  startThreadA(){
         Thread threadA = new Thread(){
             @Override
             public void run() {
                   synchronized (lockA){
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }

                   synchronized (lockB){

                   }
             }
         };
         threadA.start();
    }static void  startThreadB(){
         Thread threadA = new Thread(){
             @Override
             public void run() {
                   synchronized (lockB){
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }

                   synchronized (lockA){

                   }
             }
         };
         threadA.start();
    }

}

