package com.example.sunday.kotlinstudy.lists

import android.support.v4.widget.SimpleCursorAdapter
import java.io.File.separator


fun main(args:  Array<String>){
    print("hello")

//    val numbers = mutableListOf("one","twee","three") //可写操作的list.用于特定位置 添加或删除


    var datas = listOf<String>("one","twee","three")


     val  sets = setOf(1,2,4,5) //存储唯一的元素，顺序通常是未定义的，null 元素通常也是唯一的一个


     var  numberMap = mapOf("key1" to 1,"key2" to 2,"key3" to 3) //包含相同键值对的两个map总是相等的，与顺序无关 MutableMap 是具有写的操作的



//     println("All keys： ${numberMap.keys}")

     var empty = emptyList<String>()// 创建一个空的集合

     var double =  List(3,{it * 2})

     //复制

     var sourceList = mutableListOf(1,2,3)

     val  copyList = sourceList.toList()

     //合并
    val colors = listOf("rea","brown","grey")
    val animals = listOf("fox","bear","wold")
//     println(colors zip animals)

     val  num = listOf(setOf(1,2,3), setOf(4,5,6), setOf(1,2))

//     println(num.flatten())

     val dataOne = listOf("one","twee","three")
//      println(dataOne.joinToString())

//     println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))


//      val numbresss = (1..100).toList()
//
//      println(numbresss.joinToString ( limit = 9, truncated = "<...>" )) //1, 2, 3, 4, 5, 6, 7, 8, 9, <...>
    val numberssss = listOf("one", "two", "three", "four")

//    println(numberssss.joinToString { "Element: ${it.toUpperCase()}"})

    //过滤
    val numberss = listOf("one","twee","three","four")
//    println(numberss.filter { it.length > 3 })

    var  numberMapss = mapOf("key1" to 1,"key2" to 2,"key11" to 13)

    val filterMap =  numberMapss.filter { (key,value) -> key.endsWith("1")  &&  value > 10 }
//    println(filterMap)


    val numberssssA = listOf("one", "two", "three", "four")

//    val filteredIdx = numberssssA.filterIndexed { index, s -> (index != 0) && (s.length < 5) }
//    val filteredNot = numberssssA.filterNot { it.length <= 3 }
//    println(filteredIdx)
//    println(filteredNot)


    val numberB= listOf("one", "two", "three", "four")

     val  plusList = numberB + "five"
     val  minusList =  numberB - listOf("three","four")

//    println(plusList)
//    println(minusList)

//    val numbersC = listOf("one", "two", "three", "four", "five")
//    println(numbersC.groupBy { it.first().toUpperCase() })
//    println(numbersC.groupBy(keySelector = { it.first() }, valueTransform = { it.toUpperCase()
//    }))


//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(1..3))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3, 5, 0)))


//    println(numbers.take(3))
//    println(numbers.takeLast(3))
//    println(numbers.drop(1))
//    println(numbers.dropLast(5))


//     val numbers = (0..13).toList()
//     println(numbers.chunked(4))

//      val numbers = listOf("one", "two", "three", "four", "five")
//      println(numbers.windowed(3))

//      val numbers = (1..10).toList()
//    println(numbers.windowed(3, step = 2, partialWindows = true))
//    println(numbers.windowed(3) { it.sum() })

//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.zipWithNext())
//    println(numbers.zipWithNext() { s1, s2 -> s1.length > s2.length})


    val numbers = linkedSetOf("one", "two", "three", "four", "five")
    println(numbers.elementAt(3))
    val numbersSortedSet = sortedSetOf("one", "two", "three", "four")
    println(numbersSortedSet.elementAt(0)) // elements are stored in the ascending order



}
