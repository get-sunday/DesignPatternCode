package com.example.sunday.kotlinstudy.interfaces

import java.text.ParsePosition

interface MyInterface {
    fun  bar()
    fun foo(){
        print(prop)
    }

    val prop: Int //抽象的
    val propertyWithImplementation: String
        get() = "foo"
}
class Child : MyInterface{
    override val prop: Int = 29

    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

//接口继承
interface  Named {
      val name: String

}
interface  Person : Named{
     val  firstName:  String
     val  secondName: String
    override val name: String
        get() = "$firstName $secondName"
//        set(value) =
}

data  class   Employee(
        override val firstName: String,
        override val secondName: String,
        val position: ParsePosition


) : Person

//解决覆盖冲突问题
interface A {
    fun foo(){
        print("A")
    }
    fun bar()
}
interface B {
    fun foo(){
        print("A")
    }
    fun bar(){
        print("bar")
    }
}
interface C : A {
    override fun bar(){
        print("bar")
    }
}
class  D : A,B {
    override fun foo() {
         super<A>.foo()
         super<B>.foo()

    }
    override fun bar(){
         super<B>.bar()
    }
}
//接口A和B都定义foot()和ba()方法。
//我们从A和B派生到D，我们需要实现从多个接口继承的所有方法，并指明D应该如何实现他们。
//这一规则适用单个继承bar()的方法，同样也适用于继承多个实现foot()的方法

