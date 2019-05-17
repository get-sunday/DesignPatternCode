package com.sunday.test.https.interfaces;

import org.apache.http.HttpEntity;

/**
 * 获取网络
 */
public interface IHttpListener {


    void  onSucess(HttpEntity httpEntity);

    void onFail(int i);

}
