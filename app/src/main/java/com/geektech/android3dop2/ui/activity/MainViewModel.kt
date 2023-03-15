package com.geektech.android3dop2.ui.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel: ViewModel(){

    private var list: MutableLiveData<Int> = MutableLiveData()

    fun getRandomNumber(): MutableLiveData<Int> {
        val randomInt = Random.nextInt(100)
        list.value = randomInt
        return list
    }
}