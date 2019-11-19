package com.sunday.study.one.leaks.aops.login;

import android.util.Log;
import android.view.View;

import com.sunday.study.one.leaks.App;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CheckLoginAspect {

    @Pointcut("execution(@com.sunday.study.one.leaks.aops.login.CheckLogin * *(..))")//方法切入点
    public void methodAnnotated() {

    }
//
    @Around("methodAnnotated()")//在连接点进行方法替换
    public void aroundJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        if (App.isLogin) {
              joinPoint.proceed();
        }else {
            Log.e("tags","isloginss");
        }
//        joinPoint.proceed();//执行原方法
    }

//    @Pointcut("execution(@com.sunday.study.one.leaks.aops.login.CheckLogin * * (..))") //方法切入点
//    public void  methodAnnotated(){
//
//    }

//     @Around("methodAnnotated")
//     public void aroundJoinPoints(ProceedingJoinPoint point) throws Throwable{
//        Log.e("tags","islogin");
//        point.proceed();
//    }
}
