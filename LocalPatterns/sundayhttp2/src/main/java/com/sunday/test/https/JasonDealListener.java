package com.sunday.test.https;

import android.os.Handler;
import android.os.Looper;

import com.alibaba.fastjson.JSON;
import com.sunday.test.https.interfaces.IDataListener;
import com.sunday.test.https.interfaces.IHttpListener;

import org.apache.http.HttpEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @param <M>  对应的响应类
 */
public class JasonDealListener<M> implements IHttpListener {

    private  Class<M>  response;

    //回调 调用层的接口
    private IDataListener dataListener;

    Handler handler = new Handler(Looper.getMainLooper());
    public JasonDealListener(Class<M> response, IDataListener iDataListener) {
        this.response = response;
        this.dataListener = iDataListener;
    }

    @Override
    public void onSucess(HttpEntity httpEntity) {
         InputStream contents = null;
        try {
            contents = httpEntity.getContent();

            /**
             *  得到网络返回的数据
             */
            String content = getContent(contents);
             final M m = JSON.parseObject(content,response);
             handler.post(new Runnable() {
                 @Override
                 public void run() {
                     dataListener.onSuccess(m);
                 }
             });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getContent(InputStream inputStream) {
        String content=null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            StringBuilder sb = new StringBuilder();

            String line = null;

            try {

                while ((line = reader.readLine()) != null) {

                    sb.append(line + "\n");

                }

            } catch (IOException e) {

                System.out.println("Error=" + e.toString());
                dataListener.onFail();
            } finally {

                try {

                    inputStream.close();

                } catch (IOException e) {

                    System.out.println("Error=" + e.toString());

                }

            }
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
            dataListener.onFail();
        }
        return content;
    }

    @Override
    public void onFail(int i) {

    }
}
