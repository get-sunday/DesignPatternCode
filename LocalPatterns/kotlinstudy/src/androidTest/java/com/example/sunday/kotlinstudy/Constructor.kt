package com.example.sunday.kotlinstudy


//一个类可以有一个主构造函数，以及一个或者多个次构造函数。
class Person constructor(name : String){

}

//如果没有任何注解或是可见性修饰符，可以省略constructor  关键字
class Persons (name : String){

}

//在实例化期间，初始化代码块按照他们出现在类体中的顺序执行，与属性初始化器交织在一起
//可增加修饰符
class  InitOrderDemo(var  name : String, var age : Int){
     val firstproperty = "First property“ ${name}".also(::println)

    init {
        println("First initializer  block that prints ${name}")

    }

    val  secondproperty = "Second property“ ${name}".also(::println)

    init {
        println("Second initializer  block that prints ${name}")

    }

}

//次构造函数
//如果类有一个主构造函数，每个次构造函数需要委托给次构造函数，可以直接委托挥着通过别的次构造函数间接委托。
//委托到同一个类的另一个构造函数用this关键字即可
class Child(name : String){

     var  children : MutableList<Person> = mutableListOf<Person>()

     constructor(name: String, parent : Person) : this(name){

//
     }        ;
}

class  Constructors{
     init {
         println("Init Block")
     }
    constructor(i : Int){
         println("Constructors")
    }
}

//如果一个非抽象类没有申明任何主或次构造函数，它会有一个生成的不带参数的主构造函数。构函的可见性是public..

//共有一个Any超类
class Constructorss private constructor(){

}

//如何申明一个显示的超类型
open class  Base(p : Int){

}
class Derived(p : Int) : Base(p){

}



//构造函数的测试
fun main(ags : Array<String>){

//     var  obj = InitOrderDemo("Sunday",14)
    var  constructors = Constructors(1)
}










