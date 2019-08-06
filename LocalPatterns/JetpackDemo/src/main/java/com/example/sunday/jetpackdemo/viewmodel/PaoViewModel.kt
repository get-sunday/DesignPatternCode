package com.example.sunday.jetpackdemo.viewmodel

import android.databinding.ObservableField
import com.example.sunday.jetpackdemo.model.data.Article
import com.example.sunday.jetpackdemo.model.service.PaoService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PaoViewModel(val remote :  PaoService) {


    val articleDetail =  ObservableField<String>()

    fun loadArticle(){
        remote.getArticleDetail(8773)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({t: Article ->
                        articleDetail.set(t?.toString())
                },{
                    t: Throwable? ->
                     articleDetail.set(t?.message ?: "error")
                })
    }
}