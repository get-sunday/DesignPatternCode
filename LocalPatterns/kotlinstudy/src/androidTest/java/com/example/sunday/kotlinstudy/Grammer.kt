package com.example.sunday.kotlinstudy


fun main(args:  Array<String>){

//     print("hello sunday" + getAge(1))
     foo()
}

fun getAge(age : Int) = when(age){
            1 -> 3
            2,5  -> 4
            else -> {
                 5
            }
        }
//返回和跳转
//return  默认从最直接包围它的函数或者匿名函数返回
//-break  终止直接包围它的循环
//-continue  继续下一次最直接包围它的循环

fun foo(){

//    listOf(1,2,3,4,5).forEach {
//        if (it == 3) return
//        print(it)
//
//    } //非局部直接返回 foo() 的调用者

//
//    listOf(1,2,3,4,5).forEach lit@{
//         if (it == 3) return@lit  //非局部返回到改 lanbda 表达式的调用者，即forEach循环
//         print(it)
//    }

//    listOf(1,2,3,4,5).forEach {
//        if (it == 3) return@forEach  //非局部返回到改 lanbda 表达式的调用者，即forEach循环
//        print(it)
//    }
//

    listOf(1,2,3,4,5).forEach {
        fun(value: Int) {
            if (value == 3) return
            print(value)
        }
    }


    print("this  point is unreacheable")

}

