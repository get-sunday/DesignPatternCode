package com.example.sunday.jetpackdemo.databindings

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.sunday.jetpackdemo.R
import com.example.sunday.jetpackdemo.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         var mBinding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
//         var model = LoginModel()
          mBinding.model = LoginModel()
    }
}