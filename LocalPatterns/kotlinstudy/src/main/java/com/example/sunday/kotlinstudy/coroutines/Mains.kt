package com.example.sunday.kotlinstudy.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    var job = launch {
        repeat(1000){ i ->
            println("挂起中$i...")
            delay(500L)
        }
     }
//     delay(1300L)
//     println("主线程等待中...")
//     job.cancel()
//    println("主线程退出...")
//
    val job2 =  async {
         delay(500L)
         return@async "hello"
    }
    println("job2的输出" + job2.await())

//     println("Hello ")

}

fun  getUsr(): String{
    return "hello"
}