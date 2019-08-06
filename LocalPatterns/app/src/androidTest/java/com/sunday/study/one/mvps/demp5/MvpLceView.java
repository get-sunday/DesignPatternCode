package com.sunday.study.one.mvps.demp5;

public interface MvpLceView<D> {

     void showLoading(boolean isPullToRefresh);

      void showContent(boolean isPullToRefresh);


      void showError(boolean isPullToRefresh);

      void bindData(D data, boolean isPullToRefresh);

      void loadData(boolean isPullToRefresh);
}
