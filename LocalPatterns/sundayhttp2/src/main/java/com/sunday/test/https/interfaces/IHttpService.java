package com.sunday.test.https.interfaces;

public interface IHttpService {


    void setUrl(String url);

    void excute();

    /**
     *
     * @param httpListener
     */
    void setHttpListener(IHttpListener httpListener);


    void setRequestData(byte [] requestData);

}
