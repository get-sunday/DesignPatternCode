package com.sunday.study.one.leaks.aops;

import android.util.Log;

import com.google.common.util.concurrent.ForwardingListenableFuture;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Target;

import javax.crypto.interfaces.PBEKey;

/**
 *   切面
 *
 *   你想要切下来的蛋糕
 *
 */
@Aspect
public class BehaviorAspect {

     private  String TAG = "BehaviorAspect";

    /**
     * 如
     */
    @Pointcut("execution(@com.sunday.study.one.leaks.aops.BehaviorTrace * *(..))")
    public  void  anoBehaviro(){

    }

    @Around("anoBehaviro")
    public void dealPoint(ProceedingJoinPoint point) throws  Throwable{

        MethodSignature signature = (MethodSignature) point.getSignature();
        //日志的
        BehaviorTrace  behaviorTrac =  signature.getMethod().getAnnotation(BehaviorTrace.class);

        Log.e(TAG,"使用时间：" + System.currentTimeMillis());
        String value =  behaviorTrac.value();

    }
}
