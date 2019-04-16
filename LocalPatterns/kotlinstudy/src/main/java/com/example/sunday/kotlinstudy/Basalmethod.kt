package com.example.sunday.kotlinstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 *
 * file https://www.kotlincn.net/docs/reference/idioms.html
 *
 *   ** 返回和跳转
 *
 */
class Basalmethod : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        sumsss(2, 3)
//        testFor()
//        testRange()
         testList()
    }

    fun main(args: Array<String>) {
        sumsss(1, 3)
    }

    fun sums(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 将表达式作为函数体，返回值类型自动推断的函数
     */
    fun sumss(a: Int, b: Int) = a + b

    /**
     * 函数返回无一意义的值
     */
    fun sumsss(a: Int, b: Int): Unit {
        println("sum  of $a and  $b is ${a + b}")
    }

    /**
     * 2.定义变量
     */
    //定义只读变量A使用关键字val定义，只能为其赋值一次
    val a: Int = 1 //立即赋值
    val b = 2  //自动推断出“Int”类型
//    val c: Int
//    c = 3

    fun test() {
        //可重新赋值的变量使用var关键字
        var xs = 3.14
        xs += 1
    }

    //使用字符串模板
    var d = 1
    var d1 = "a is $d"
    //模板中的任意表达式
    val d2 = "${d1.replace("is", "was")}, but now is $d"

    //使用条件表达式
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    //使用if表达式
    fun maxOfs(a: Int, b: Int) = if (a > b) a else b

    //使用类型检测及类型自动转换
    //is 运算符检测一个表达式时候某类型的一个实例，如果一个不可变的局部变量或属性已经判断出
    //某种类型，那么检测后的分支中可以做改类型的使用，无需显示转换
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }

        //离开类型检测分之后，‘obj’任然是‘aany’类型

        return null
    }

    //或者
    fun getStringLengths(obj: Any): Int? {
        if (obj !is String) return null

        return obj.length //‘obj’ 分支自动转换为 ‘string’
    }

    //甚至
    fun getStringLengthThree(obj: Any): Int? {
        if (obj is String && obj != null) {
            return obj.length
        }
        return null
    }

    //使用for 循环
    fun testFor() {
        val itemsss = listOf("apple", "bannan", "kfss")
        for (item in itemsss) {
            println(item)
        }
        for (index in itemsss.indices) {
            println("item at $index is ${itemsss[index]}")
        }

        for (n in 1..3) {
            print(n)
        }


    }

    //while
    fun testWhile() {

    }

    //when
    fun describe(obj: Any) {
        when (obj) {
            1,2 -> "one"
            "hello" -> "Greeting"
            in  1..10 -> "x is in the ragnge"
            is Long -> "logn"
            !is String -> "not a String"
            else -> "UnKnown"
        }
    }

    //区间range
    fun testRange(){
        val  x = 0
        val y = 10
//        if (x in 1..y+1) {
//            print("fits in range")
//        }
//
//        //检测某个数字是否在指定区间外
//        val datas = listOf("a","b","c")
//        if (-1 !in  0..datas.lastIndex) {
//            println("-1 is out of range")
//
//        }
//
//        if (datas.size - 1 !in datas.indices) {
//            println("list size  is out of  valid  list indices range,too")
//        } else {
//            println("list datas")
//        }

        //downTo 倒叙迭代数字
//        for (i in  5 downTo  1) {
//             println(i)
//        }

        for (i in 1..4 step  2) println(i) //print 1,3
        for (i in 5 downTo  1 step 2) println(i)

    }

    fun  testList() {
        var items = listOf("a", "b", "c", "d")
//        for (i in items) print(i)
//        //使用in运算符来判定集合内是否包含某实例
//        when {
//            "orange" in items  -> println("juidy")
//            "apple" in items -> println("apple is fine too")
//        }
        //使用lambda 表达式过滤（fileter）和映射（map）集合
        val fruits = listOf("banana","avocodo","apple","kiwifruit")
        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase()}
                .forEach {
                    println(it)
                }
    }

    fun testLable(){
        loop@ for(i in 1.. 100){

        }
    }



}

