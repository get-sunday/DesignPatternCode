package com.example.sunday.jetpackdemo.view

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.sunday.jetpackdemo.R
import com.example.sunday.jetpackdemo.databinding.ActivityPaoBinding
import com.example.sunday.jetpackdemo.model.service.PaoService
import com.example.sunday.jetpackdemo.viewmodel.PaoViewModel
import com.uber.autodispose.AutoDispose
import com.uber.autodispose.SingleSubscribeProxy
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 *  需求
 *  处理内存泄露问题
 *  可以使用CompositeDisposable 将所有的订都统一处理，但是使用RxLifecycle 更加方面
 *
 */
class PaoActivity2 : AppCompatActivity() {
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

     fun onOptionsItemSelecteds(item: MenuItem?): Boolean {
         //viewModel and thens so a junk foods and then so
         //junk foods and then so a goods friends

//        item?.let {
//            when(it.itemId){
//                R.id.action_refresh -> mViewMode.loadArticle().compose(bindToLifecycle())
//                        .subscribe { _, error -> dispatchError(error) }
//                else -> { }·
//            }
//        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

//          mViewMode.loadArticle().compose(bin )
//        mViewMode.loadArticle().compose(bindLifeCycle)
//        mViewMode.loadArticle()
//                .subscribe { _, error -> dispatchError(error) }

        return super.onOptionsItemSelected(item)
    }
    fun <T> Single<T>.bindLifeCycle(owner: LifecycleOwner): SingleSubscribeProxy<T> =
            this.`as`(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(owner, Lifecycle.Event.ON_DESTROY)))


}
