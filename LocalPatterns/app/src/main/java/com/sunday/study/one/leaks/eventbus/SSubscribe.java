package com.sunday.study.one.leaks.eventbus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  java.lang.annotation.Targget
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SSubscribe {
     SThreadModule threadMode() default  SThreadModule.POSTING;
}
