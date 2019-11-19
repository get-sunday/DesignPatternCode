package com.sunday.study.one.reference;

import android.support.v4.widget.TextViewCompat;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class tes {

    @Test
    public void  test(){

        //Threads and then so a junk foods
        ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return  "Jett 老师";   //默认返回 null
//                 return super.initialValue();
            }
        };


        //So a  junk foods jin tian zao shang de rizhide faghide  variant.getJavaCompile
        System.out.println("主线程的threadLocal： " + threadLocal.get());
        //--------------Thread-1
         Thread thread = new Thread(new Runnable() {
             @Override
             public void run() {

             }
         });
         //重复性质的来阅读额的啦！啊哈哈，之间的配置的过程的简单地Event Logs，and thens so a junk foods


         thread.start();
    }

    @Test
    public void testFutureTask(){

        //So a junk foods
        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Sundays";
            }
        });

    }
}