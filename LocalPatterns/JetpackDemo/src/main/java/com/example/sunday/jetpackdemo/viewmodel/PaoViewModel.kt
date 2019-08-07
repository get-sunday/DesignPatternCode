package com.example.sunday.jetpackdemo.viewmodel

import android.databinding.ObservableField
import com.example.sunday.jetpackdemo.model.data.Article
import com.example.sunday.jetpackdemo.model.service.PaoService
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

/**
 *   错误的做法：
 *   1.将activty和frgment的Context作为参数传入进去，然后直接在Viewmodel中使用。X因为VidewModel 中
 *   不应该有任何Context的引用（除咯App的ApplicationContext）,而是尽量的使用Java\kotlin 代码。
 *     一是为咯单元测试的便捷性，
 *     二是为咯防止内存泄露
 *
 *   2.使用回调到Activity或frgment去处理,MVP?
 *   3.聪明点的做法是自定义一个BingAdapter，通过绑定View的Context
 *     @BindingAdapter(value = "toast")
       fun bindToast(v: View,msg:Throwable ?){
          msg?.let {
           Toast.makeText(v.context,it.message,Toast.LENGTH_SHORT).show()
        }
   *
 *
 *
 *   4.
 *
 */
class PaoViewModel(val remote :  PaoService) {

    val articleDetail =  ObservableField<String>()
    val loading = ObservableField<Boolean>()
    val title = ObservableField<String>()


    fun loadArticles(){
        remote.getArticleDetail(8773)
                .async(1222)
                .doOnSubscribe {  started()}
                .doAfterTerminate { stopted() }
                .subscribe({t: Article ->
                        articleDetail.set(t?.toString())
                },{
                    t: Throwable? ->
                     articleDetail.set(t?.message ?: "error")
                })
    }

    //优化 方便在Activity或Fragment 中接收反馈
    fun loadArticle() : Single<Article> =
            remote.getArticleDetail(8773)
                .async(1222)
                    .doOnSuccess { t:Article? ->
                        t?.let {
                             title.set(it.title)
                             it.content?.let {
                                  articleDetail.set(articleDetail.toString())
                             }
                        }
                    }
                .doOnSubscribe {  started()}
                .doAfterTerminate { stopted() }



    //增加一个RxJAVA的拓展函数
    fun <T> Single<T>.async(withDelay: Long = 0): Single<T> =
            this.subscribeOn(Schedulers.io())
                    .delay(withDelay, TimeUnit.MILLISECONDS)
                    .observeOn(AndroidSchedulers.mainThread())

    fun started() = loading.set(true)
    fun stopted() = loading.set(false)



}