package com.sunday.test.https;

import com.sunday.test.https.interfaces.IHttpListener;
import com.sunday.test.https.interfaces.IHttpService;

import org.apache.http.HttpClientConnection;

/**
 *  第一步 分析含有的成员变量
 *  2.
 */
public class JasonHttpService implements IHttpService {

    private  IHttpListener iHttpListener;
//    private HttpClient httpClient=new DefaultHttpClient();
    @Override
    public void setUrl(String url) {

    }

    @Override
    public void excute() {

    }

    @Override
    public void setHttpListener(IHttpListener httpListener) {

    }

    @Override
    public void setRequestData(byte[] requestData) {

    }
}
