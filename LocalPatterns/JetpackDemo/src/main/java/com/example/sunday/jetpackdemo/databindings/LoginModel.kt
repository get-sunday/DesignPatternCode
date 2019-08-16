package com.example.sunday.jetpackdemo.databindings

import android.databinding.BindingAdapter
import android.databinding.ObservableField
import android.text.Editable
import android.text.TextUtils.isEmpty
import android.util.Log
import android.widget.EditText
import java.util.*

class LoginModel {

     var n = ObservableField<String>()
     var p  = ObservableField<String>()

    init {
        n.set("sunday")
        p.set("18982449517")
    }
    fun login(){

        if (!n.get().toString().isEmpty() && !p.get().toString().isEmpty()) {
                Log.e("jetpack","login success")
        }else{
                 Log.e("jetpack","login fail")
        }
    }



//    // SimpleWatcher 是简化了的TextWatcher
//    val nameWatcher = object : SimpleWatcher() {
//        override fun afterTextChanged(s: Editable) {
//            super.afterTextChanged(s)
//
//            n.set(s.toString())
//        }
//    }
//
//    @BindingAdapter("addTextChangedListener")
//    fun addTextChangedListener(editText: EditText, simpleWatcher: SimpleWatcher) {
//        editText.addTextChangedListener(simpleWatcher)
//    }

    //事件绑定
    //通知时间绑定
    //Bingable
    //BindingAdapter
    //BindingMethods
    //BindingConversion



}