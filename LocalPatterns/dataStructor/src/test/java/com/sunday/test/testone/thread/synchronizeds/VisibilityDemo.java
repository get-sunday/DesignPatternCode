package com.sunday.test.testone.thread.synchronizeds;

public class VisibilityDemo {

     public static  boolean shutdone = false;


     static  class HelloThread extends  Thread{

         @Override
         public void run() {

             while (!shutdone){
                 System.out.println("exit one");
             }
             System.out.println("exit hello");
         }

     }
}
