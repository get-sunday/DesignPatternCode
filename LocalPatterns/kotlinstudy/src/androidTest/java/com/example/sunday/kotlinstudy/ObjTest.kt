package com.example.sunday.kotlinstudy

import java.util.*
import kotlin.Boolean as Boolean1


/***
 *  对象表达式和对象申明
 */

open class A(x : Int,y : Int){
    public open  val y: Int = x
    val  x : Int = y
}

interface  B{
}

fun foos(){

    val adHoc = object {
         var x :Int = 0
         var y : Int = 0
    }

    println(adHoc.x+adHoc.y)

}

class  C{

    private fun  foo() = object {
          val x : String = "x"
    }

    //公有函数，返回的类型是Any
    fun PublishFoo() = object {
         val x : String = "y"
    }

    fun  bar(){
         var x1 = foo().x
//        var x2 = PublishFoo().x error
    }

}

/**
 * 伴生对象
 *  看起来像其他语言的静态成员，在运行时任然是真实对象的实例成员
 *  同样也可实现接口
 */

//class  MyClass{
//      companion object Factory{
//           fun create() : MyClass  =  MyClass()
//      }
//}

interface Factory<T>{
    fun create() : T
}

class  MyClass{
    companion object : Factory<MyClass>{
        override fun create(): MyClass {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}

/**
 *  类型别名  typealias
 */
class  Bc{

//    typealias  MyHandler  = (Int, String, Any) -> Unit
}




fun main(args : Array<String>){

//    val  ab : A  = object : A(1,2){
//        override val y = 15
//    }
//    println("${ab.x}")

     foos()






}