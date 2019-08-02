package com.sunday.study.one.mvps.demo3.base;

public abstract  class BasePresenter<V extends  BaseView>{

    private V view;

    public void attachView(V view){
        this.view = view;
    }


    public void detachView(){
        this.view = null;
    }
}
