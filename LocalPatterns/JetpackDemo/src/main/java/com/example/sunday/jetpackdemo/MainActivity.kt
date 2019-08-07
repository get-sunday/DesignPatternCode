package com.example.sunday.jetpackdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.sunday.jetpackdemo.model.Animal

/**
 *  需求
 *  1.点击按钮，shoutCount+1 并更新信息
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var    animal = Animal("dog",0)

//        //第一种方案
////        findViewById<TextView>(R.id.views).text = "${animal.name} 叫了 ${animal.shoutCount} 声音..."
////        findViewById<TextView>(R.id.views).setOnClickListener{
////               animal.shoutCount++
////               findViewById<TextView>(R.id.views).text = "${animal.name} 叫了 ${animal.shoutCount} 声音..."
////        }

          //第二种创建AnimalModel



    }
}
