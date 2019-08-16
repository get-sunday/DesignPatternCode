package com.example.sunday.jetpackdemo.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.sunday.jetpackdemo.R
import com.example.sunday.jetpackdemo.databinding.ActivityPaoBinding
import com.example.sunday.jetpackdemo.model.service.PaoService
import com.example.sunday.jetpackdemo.viewmodel.PaoViewModel
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 *  需求
 */
class PaoActivity : AppCompatActivity() {
    lateinit var mBinding : ActivityPaoBinding
    lateinit var mViewMode : PaoViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding  = DataBindingUtil.setContentView(this, R.layout.activity_pao)

        val remote= Retrofit.Builder()
                .baseUrl("http://api.jcodecraeer.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(PaoService::class.java)

        /////ViewModel
        mViewMode= PaoViewModel(remote)
        //binding
        mBinding.vm= mViewMode
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        mViewMode.loadArticle()
                .subscribe { _, error -> dispatchError(error) }

        return super.onOptionsItemSelected(item)
    }

    private fun dispatchError(error: Throwable?) {


    }
}
