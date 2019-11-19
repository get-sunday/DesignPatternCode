package com.sunday.study.one.mvps;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sunday.study.one.R;
import com.sunday.study.one.mvps.demo2.LoginPresenter_2;
import com.sunday.study.one.mvps.demo3.LoginPresenter;
import com.sunday.study.one.mvps.demo3.LoginView;
import com.sunday.study.one.mvps.demo3.base.BaseActivitys;

public class LoginActivity extends BaseActivitys<LoginView, LoginPresenter>{

    private LoginPresenter_2 presenter_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logins();
            }
        });

        Glide.with(this).load("").into(new ImageView(this));
    }


    //日志的配置的方式的
    private void logins() {
        String name = "Sunday";
        String pwd = "123456";
        getPresenter().login(name,pwd);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
         presenter_2.detachView();
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected LoginView createView() {
        return new LoginView();
    }

}
