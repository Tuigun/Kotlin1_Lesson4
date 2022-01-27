package com.example.kotlin1_lesson4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var mCounter = 0
    val counter = MutableLiveData<Int>()
    val text = MutableLiveData<String>()

    fun add (){
        counter.value = ++mCounter
        val add = "add \n"
        text.value += add
    }
    fun minus (){
        counter.value = --mCounter
        val minus = "minus \n"
        text.value += minus
    }
}