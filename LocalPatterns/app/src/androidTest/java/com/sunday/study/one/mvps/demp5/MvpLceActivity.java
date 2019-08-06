package com.sunday.study.one.mvps.demp5;

import com.sunday.study.one.mvps.demo4.base.MvpPresenter_13;
import com.sunday.study.one.mvps.demo4.base.MvpView_13;
import com.sunday.study.one.mvps.demo4.support.activity.MvpActivity_13;

public   class MvpLceActivity<D,V extends MvpView_13, P extends MvpPresenter_13<V>> extends MvpActivity_13<V,P> implements  MvpLceView<D>{

    //代理对象持有目标函数的引用

    @Override
    public void showLoading(boolean isPullToRefresh) {


    }

    @Override
    public void showContent(boolean isPullToRefresh) {

    }

    @Override
    public void showError(boolean isPullToRefresh) {

    }

    @Override
    public void bindData(D data, boolean isPullToRefresh) {

    }

    @Override
    public void loadData(boolean isPullToRefresh) {

    }
}
