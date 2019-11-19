package com.sunday.study.one.leaks.eventbus;

import android.os.Handler;

import java.io.PipedReader;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final  class SEventBus {

     public static   SEventBus instance = new SEventBus();

     private Map<Object, List<SubscribleMethod>>  cacheMap;

     private  Handler handler;

     private ExecutorService executorService;

     public static SEventBus getDefault(){
          return  instance;

     }


     private  SEventBus(){
          cacheMap = new HashMap<>();
          handler = new Handler();
          executorService = Executors.newCachedThreadPool();
     }


     //So a junk foods
     public void  register(Object subscriber){
          Class<?>  clazz = subscriber.getClass();
          List<SubscribleMethod> subscribleMethods = cacheMap.get(subscriber);
          if (subscribleMethods ==  null) {
               ;subscribleMethods = getSubscribleMethods(subscriber);
          }
     }

     private List<SubscribleMethod> getSubscribleMethods(Object subscriber) {
           List<SubscribleMethod> list = new ArrayList<>();
          Class<?> aClass = subscriber.getClass();
          while (aClass != null) {
               String name = aClass.getName();
               if (name.startsWith("java.") ||  name.startsWith("javax.")
                  ||  name.startsWith("android.") ||  name.startsWith("androidx.x")) {
                    break;
               }

               //日志的方式的啦！
               Method[] declaredMethods = aClass.getDeclaredMethods();
               for (Method method : declaredMethods){
                    SSubscribe annotation = method.getAnnotation(SSubscribe.class);
                    if (annotation == null) {
                          continue;
                    }
                    //检测这个方法是否合格
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != 1) {
                          throw new  RuntimeException("SEventBus　只接收一个参数");
                    }

                    SThreadModule sThreadModule = annotation.threadMode();
                    SubscribleMethod methods1 = new SubscribleMethod(method,sThreadModule,parameterTypes[0]);
                    list.add(methods1);
               }

               aClass = aClass.getSuperclass();

          }
          return  list;
     }


     //So a junk foods
     public void unregister(Object subscriber){
          Class<?> aClass = subscriber.getClass();
          List<SubscribleMethod> methods = cacheMap.get(subscriber);
          if (methods != null) {
               cacheMap.remove(subscriber);
          }
     }

}
