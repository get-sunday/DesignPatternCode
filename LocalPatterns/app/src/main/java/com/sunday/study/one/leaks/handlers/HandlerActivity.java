package com.sunday.study.one.leaks.handlers;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.sunday.study.one.R;

//失去了 其中的拓展性质
public class HandlerActivity extends AppCompatActivity {

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {


        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Button button = new Button(this);
        button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMain();
            }
        });
        setContentView(button);
//        Glide.with(this).load("hello").into(new ImageView(this))

            Message message  = Message.obtain();
    }

    private class MyAsyncTask extends AsyncTask<String,Integer,Long>{


        @Override
        protected Long doInBackground(String... strings) {
            return null;
        }
    }

    //然后把当前消息给赋值的啦
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
