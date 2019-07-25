package com.sunday.test.testone.thread;

import org.junit.experimental.theories.Theories;

import java.util.List;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

public class ShareMemoryDemo {

    public   static int  shared =  0;
    private static void incrShared(){
         shared  ++;

    }


    static class ChildThread extends Thread{
         List<String>  list;

         public ChildThread(List<String> list){
              this.list = list;
         }

        @Override
        public void run() {
             incrShared();
             list.add(Thread.currentThread().getName());
        }
    }


}
