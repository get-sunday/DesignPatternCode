package com.sunday.study.one.mvps.demp5.impl;

import com.sunday.study.one.mvps.demp5.MvpLceView;

/**
 *  实现Lce动画-> 策略模式
 *  策略
 * @param <D>
 */
public class MvpLceViewImpl<D> implements MvpLceView<D> {


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
