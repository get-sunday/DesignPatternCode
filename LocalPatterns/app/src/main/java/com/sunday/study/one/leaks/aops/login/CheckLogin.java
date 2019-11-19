package com.sunday.study.one.leaks.aops.login;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *    检查用户是否登录注解，通过AOP切片的方式在编译期间织入源代码中
 *    功能： 检查用户时候登陆，未登录提示登录，不会执行下面的逻辑
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface CheckLogin {
     //检查其中的功能的设计的配置的过程的数据的啦！ 啊哈哈
     //So a junk foods
}
