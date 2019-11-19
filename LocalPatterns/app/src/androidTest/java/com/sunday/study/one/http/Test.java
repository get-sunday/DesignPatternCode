package com.sunday.study.one.http;

import com.bumptech.glide.RequestBuilder;

import java.io.IOException;
import java.security.PublicKey;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Test {

    @org.junit.Test
    private void testHttp(){


        OkHttpClient okHttpClient = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json;charset=utf-8");

        RequestBody body = RequestBody.create(mediaType,"");

        Request request = new  Request.Builder()
                .url("")
                .post(body)
                .build();

        Response response;
        try {
             response =  okHttpClient.newCall(request).execute();
            String result =  response.body().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }



    }


}
