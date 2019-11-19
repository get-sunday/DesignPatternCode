package com.sunday.study.one.leaks.eventbus;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import org.greenrobot.eventbus.EventBus;

//失去了 其中的拓展性质
public class EventBusActivity extends AppCompatActivity {

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {


        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventBus.getDefault().register(this);
        EventBus.getDefault().post(":sunday ahha");
        //So a junk foods and then so a
    }

    //So a junk foods and then so a junk foods
    private void goMain(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                handler.sendMessage(message);

            }
        }).start();
    }



}

