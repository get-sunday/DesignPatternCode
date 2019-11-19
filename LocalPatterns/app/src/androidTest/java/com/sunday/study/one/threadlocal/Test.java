package com.sunday.study.one.threadlocal;

import java.net.StandardSocketOptions;

public class Test {

     @org.junit.Test
    public void  test(){

         ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
             @Override
             protected String initialValue() {
                   return  "Jett 老师";   //默认返回 null
//                 return super.initialValue();
             }
         };

          System.out.println("主线程的threadLocal： " + threadLocal.get());
     }
}
