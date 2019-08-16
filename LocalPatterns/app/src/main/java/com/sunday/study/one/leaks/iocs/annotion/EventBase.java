package com.sunday.study.one.leaks.iocs.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  时间的三要素：
 *    点击 长按  回调
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EventBase {

     String clickListenerSet();

}
