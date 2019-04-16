package com.example.sunday.kotlinstudy

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

open class  Base(p: Int)

/**
 * 如果派生类有个主构造函数，其基类可以（并且必须）用基类的主构造函数参数就地初始化
 *
 */
class Derived(p: Int) : Base(p){

}

//如果类没有主构造函数，那么每个次构造函数必须使用super关键字初始化其基类类型
class  MyView : View{

     constructor(ctx: Context) : super(ctx)

     constructor(ctx: Context,attrs: AttributeSet) : super(ctx,attrs)


}

//覆盖方法

open  class BaseT{
    open  fun v(){}
    fun  nv(){}
}

class DerivedT : BaseT() {
    override fun v() {
        super.v()
    }


}

//嵌套类与内部类
class Outer {
    private val bar: Int = 1
    class  Nested {
        fun foo() = 2
    }
}
class OuterT {
    private val barT: Int = 1
    class  Nested {
        fun foo() = 2
    }
}


fun testOuter(){
//    Outer.Nested
}

