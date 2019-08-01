package com.example.sunday.kotlinstudy



fun main(args:  Array<String>){


//     print("hello" + getColor("rea"))
    val x : IntArray = intArrayOf(1,2,3,4)

//      foo()
      fooss()
}

//loop@ for (i in 1..100){
//
//}
fun foo(){
    listOf(1,2,3,4,5).forEach lit@{
           if (it == 3) return@lit // 局部返回改 lambda 表达式的调用者，即 forEach循环
           print(it)
    }
    println("done with explicit lable")
}

fun foos(){
    listOf(1,2,3,4,5).forEach lit@{
           if (it == 3) return@lit // 局部返回改 lambda 表达式的调用者，即 forEach循环
           print(it)
    }
    println("done with explicit lable")
}
fun fooss() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return // 局部返回到匿名函数的调⽤者，即 forEach 循环
        print(value)
    })
    print(" done with anonymous function")
}


fun getColor(value: String): Int = when(value) {
       "rea" -> 0
       "Gren" -> 1
        else -> throw IllegalAccessException("so that there is a junk foods")
}

fun getValues(
        values : String = "ahha",
        twee : String
) : Int{

    return 1
}
