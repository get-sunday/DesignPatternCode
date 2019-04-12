package com.example.admin.patterns.proxy;

import com.example.admin.patterns.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class Client {
     public static void main(String [] args){

         String data =  "ahha ";
         IProcessor processor = new Processor();
         IProcessor proxy = (IProcessor) Proxy.newProxyInstance(processor.getClass().getClassLoader(),new Class[]{IProcessor.class}, new DynamicProxy(processor));

//         byte[] bytes = ProxyGenerator.generateProxyClass(proxy.getClass().getSimpleName(), processor.getClass().getInterfaces());
//         try {
//             FileOutputStream fileOutputStream = new FileOutputStream("out/proxy.class");
//             fileOutputStream.write(bytes);
//             fileOutputStream.flush();
//             fileOutputStream.close();
//         }catch ( Exception e){
//
//         }
         proxy.doMethod();

     }

    static    class DynamicProxy implements InvocationHandler{

         private final Object object;

         public DynamicProxy(Object object){

             this.object = object;
         }
         @Override
         public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
             LogUtils.show("Dynamic invoke beging: " + method.getName());
             Object invoke = method.invoke(object, args);
             LogUtils.show("Dynamic invoke beging: " + method.getName());

             return  invoke;
         }
     }
}
