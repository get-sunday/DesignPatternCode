package com.example.admin.patterns.utilsss;

import com.example.admin.patterns.LogUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class Client {
     public static void main(String [] args){


         /**
          * Validator  抽象出去//抽象工厂等等
          */
         new Validator()
                 .add("00000","请输入正确的",new MobileValidator())
//                 .add("111","emails",ValidatorFactory.class)
                 .verify(new Validator.ValicatorCallBack() {
                     @Override
                     public void onSuccess() {

                     }

                     @Override
                     public void onFail(String message) {
                         LogUtils.show(message);
                     }
                 });


     }

}
