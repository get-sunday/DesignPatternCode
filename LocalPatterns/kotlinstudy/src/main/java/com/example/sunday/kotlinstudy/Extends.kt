package com.example.sunday.kotlinstudy

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.view.Window
import android.widget.Button
import java.util.jar.Attributes

open class  Base(p: Int)

/**
 * 如果派生类有个主构造函数，其基类可以（并且必须）用基类的主构造函数参数就地初始化
 *
 */
class Derived(p: Int) : Base(p){

}


/**
 *  派生类的初始化顺序
 *  Argument for Base: SundayInitializing Base
Initializing size in  Base: 6
Initializing  Derived
Initializing size in Derived: 10

这意味着，基类构造函数执⾏时，派⽣类中声明或覆盖的属性都还没有初始化。如果在基类初始化逻辑
中（直接或通过另⼀个覆盖的 open 成员的实现间接）使⽤了任何⼀个这种属性，那么都可能导致不正
确的⾏为或运⾏时故障。设计⼀个基类时，应该避免在构造函数、属性初始化器以及 init 块中使⽤
open 成员。

 */
open  class Bases(val name : String ){
     init {
          println("Initializing Base")
     }
    open  val size : Int =
            name.length.also { println("Initializing size in  Base: $it") }


}
class Deriveds(name: String,val lastName : String)
    : Bases(name.capitalize().also { print("Argument for Base: $it") }) {

    init {
        println("Initializing  Derived")
    }

    override val size: Int
         = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }

}

/***
 *  调用超类实现 使用 super@ 调用
 */

open class Rectangle{
    open fun  draw(){
        println("Drawing a  rectangle")
    }

    val bordreColor  :  String get() = "black"

}

class FilledRectangle : Rectangle(){

    override fun draw() {
        super.draw()

        println("Filling the  rectangle")

    }
    val fillColor : String get() = super.bordreColor

    inner  class Filler{
         fun  fill(){

         }

        fun drawAndFill(){
            super@FilledRectangle.draw()  //调用Rectangle 的 draw 实现
            fill()
            println("Draw a filled  reactangle  with  color ${super@FilledRectangle.bordreColor}")
        }
    }

}


/**
 *  延迟初始化属性和变量
 */

public class  MyTest{
//     lateinit var  subject : Test

//    @Setup
}


//对象表达式和对象申明
class  Testwindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        var bnt : Button = Button(this);
        bnt.setOnClickListener(View.OnClickListener {

        })

    }



 }

fun main(args:  Array<String>){


     val   deriveds  = Deriveds("sunday","twee")

}




