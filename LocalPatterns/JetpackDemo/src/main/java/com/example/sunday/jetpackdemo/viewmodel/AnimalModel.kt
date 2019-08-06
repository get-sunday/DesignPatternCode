package com.example.sunday.jetpackdemo.viewmodel

import android.database.Observable
import com.example.sunday.jetpackdemo.model.Animal

class AnimalModel(val animal : Animal) {

     val info = "${animal.name} 叫了 ${animal.shoutCount} 声音.."
     fun shout(){

          animal.shoutCount++

     }

}