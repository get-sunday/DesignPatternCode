package com.example.sunday.kotlinstudy


/**
 *  函数练习
 *
 */

/***
 *  局部函数
 *
 */

/**
 * 高阶函数： 函数用作参数或是返回值的函数
 *  ****
 */
fun <T,R>  Collection<T>.fold(
        initial: R,
        combine:(acc: R,nextElement : T) -> R
) : R{

    var accumulator : R  = initial
    for (element : T in this){
        accumulator =  combine(accumulator,element)
    }

    return accumulator
}

fun  main(args : Array<String>){

     val items = listOf(1,2,3,4,5)

    // Lambdas 表达式是花括号括起来的代码块。
    items.fold(0, {
// 如果⼀个 lambda 表达式有参数，前⾯是参数，后跟“->”
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
// lambda 表达式中的最后⼀个表达式是返回值：
        result
    })



}