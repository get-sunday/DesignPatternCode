package com.sunday.study.one.mvps.demo3.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract  class BaseActivitys<V extends  BaseView,P extends BasePresenter<V>> extends AppCompatActivity {

    protected V view;
    protected  P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         inti();

    }

    private void inti() {
        view = createView();
        if (view == null) {
            throw  new  NullPointerException("view is null please checked it");
        }
        if (presenter ==  null) {
            throw  new NullPointerException("presenter is null please check it");
        }
        presenter = createPresenter();
        presenter.attachView(view);

    }
    protected P getPresenter(){
        return  presenter;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    protected abstract  P createPresenter();

    protected abstract  V createView();

}
