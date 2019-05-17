package com.sunday.test.https.interfaces;

/**
 * 字节码的配置的方式的
 * @param <M>
 */
public interface IDataListener<M> {

    void onSuccess(M m);

    void onFail();

}
