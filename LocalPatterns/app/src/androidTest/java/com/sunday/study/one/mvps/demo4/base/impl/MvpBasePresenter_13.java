package com.sunday.study.one.mvps.demo4.base.impl;

import com.sunday.study.one.mvps.demo4.base.MvpPresenter_13;
import com.sunday.study.one.mvps.demo4.base.MvpView_13;

public class MvpBasePresenter_13<V extends MvpView_13> implements MvpPresenter_13<V> {

    private V view;

    public V getView() {
        return view;
    }

    public void attachView(V view){
        this.view = view;
    }

    public void detachView(){
        this.view = null;
    }

}
