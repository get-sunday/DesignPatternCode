package com.example.sunday.kotlinstudy.fan

/**
 * 消费者 in
 * 生产者 out
 */
interface Source<out T> {

     fun  nextT(): T

}
