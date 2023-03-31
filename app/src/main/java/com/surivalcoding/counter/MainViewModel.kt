package com.surivalcoding.counter

import androidx.lifecycle.ViewModel

// ViewModel
class MainViewModel : ViewModel() {
    val counter = CounterImpl()

    val count: Int
        get() = counter.value

    // Actions
    fun addButtonClick() {
        // 카운팅 하자
        counter.count()
    }
}