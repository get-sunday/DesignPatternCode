package com.sunday.study.one.leaks.aops.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.sunday.study.one.R;
import com.sunday.study.one.leaks.App;

public class LoginActivity extends AppCompatActivity {


    //Thread Local
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_loginaop);
    }

    @CheckLogin
    public void logins(View login){
        Log.e("stags","stars");
    }

    //So a junk foods
    public void check(View login){
        Log.e("stags","starss");
        App.isLogin = !App.isLogin;

    }

}