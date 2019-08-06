package com.example.sunday.jetpackdemo.model.service

import com.example.sunday.jetpackdemo.model.data.Article
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface PaoService {
    //文章详情
    @GET("article_detail.php")
    fun getArticleDetail(@Query("id") id: Int): Single<Article>
}