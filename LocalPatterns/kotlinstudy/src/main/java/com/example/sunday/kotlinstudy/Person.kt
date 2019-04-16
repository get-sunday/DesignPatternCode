package com.example.sunday.kotlinstudy

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity


/**
 *  在kotlin中一个类有一个主构造函数以及一个或多个次构造函数。主构造函数式类头的一部分；太跟在类名（与可选的类型参数
 *  ）后面
 */
class Person constructor(firstName: String) {

}
//如果主构造函数没有任何注解或可见性修饰符，可以省略constructor关键字
//class Persoin（firstName: String）)
//并且主构造函数里边不能包含任何代码。注释化的代码可以放在以init关键字作为初始化快（initalizer blocks）中
//在实例化初始化期间，初始化的顺序按照他们在类中的顺序执行。与属性初始化器交织在一起

class InitOrderDemo(name: String) {
//    val firstProperty = "First property : $name".also { :: println }

    init {
        println("First initalizer block that prints ${name}")
    }

//    val secondProperty = "Second property : $name".also { :: println }println

    init {
        println("First initalizer block that prints ${name.length}")
    }

}
//初始化主构造函数属性，有这更为简洁的语法
class Persons(var firstName: String,val  lastName: String,var age: Int){

}
//如果构造函数中有注解或可见性修饰符，这个constructor关键字是必须的。并且这些修饰符在他前面
//class Personss public  @Inject constructor(name: String){
// Personss public @Inject constructor(name: Strings)
//}

//次构造函数
class  Student{

    constructor(student: Student){

    }
}

//如果有一个类有主构造函数，每个次构造函数需要委托给主构造函数，可以直接委托或者通过别的次构造函数间接
//委托。委托到同一个类的另一个构造函数用this关键字即可
//class Students(val name: String){
//     constructor(name: String,student: Students) ：this(name){
//
//    }
//}

/**
 *
 */
class  Conssturctors{
    init {
        println("Init Block")
    }
    constructor(i: Int){
        println("Constructor")
    }
}

/**
 * 如果一个非抽象类没有生命任何（主或次）构造函数，它会有一个生成的不带参数的主构造函数
 * 构造函数的可见性是public。如果想修改其可见性。然后我们就得带有一个非默认的可见性的空主函数
 */
class DontCreateMe private constructor(){

}
