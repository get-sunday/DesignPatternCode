package com.example.sunday.kotlinstudy.coroutines

import android.accessibilityservice.GestureDescription
import android.provider.Settings
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() {

    //First GlobalScope
//    GlobalScope.launch { // 在后台启动⼀个新的协程并继续
//        delay(1000L) // ⾮阻塞的等待 1 秒钟（默认时间单位是毫秒）
//        println("World!") // 在延迟后打印输出
//
//    }
//    println("Hello,") // 协程已在等待时主线程还在继续
//    Thread.sleep(2000L) // 阻塞主线程 2 秒钟来保证 JVM 存活


    //桥接阻塞与非阻塞的世界

    GlobalScope.launch {
        delay(1000L)
        println("World")
    }
    println("Hello")
    runBlocking {
        delay(2000L)
    }



//    //等待一个作业

//    val job  = GlobalScope.launch {
//          delay(1000L)
//        println("World")
//    }
//    println("Hello ")
//    job.join()
}



