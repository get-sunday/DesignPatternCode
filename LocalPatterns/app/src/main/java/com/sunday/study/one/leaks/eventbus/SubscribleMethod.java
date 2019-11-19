package com.sunday.study.one.leaks.eventbus;

import java.lang.reflect.Method;

//注册类中的方法信息
public class SubscribleMethod {

    private Method method;

    private  SThreadModule threadModule;

    private  Class<?> eventType;

    public SubscribleMethod(Method method, SThreadModule threadModule, Class<?> eventType) {
        this.method = method;
        this.threadModule = threadModule;
        this.eventType = eventType;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public SThreadModule getThreadModule() {
        return threadModule;
    }

    public void setThreadModule(SThreadModule threadModule) {
        this.threadModule = threadModule;
    }

    public Class<?> getEventType() {
        return eventType;
    }

    public void setEventType(Class<?> eventType) {
        this.eventType = eventType;
    }
}
