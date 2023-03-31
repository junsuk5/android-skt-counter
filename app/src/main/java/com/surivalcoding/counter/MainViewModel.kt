package com.surivalcoding.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// ViewModel
class MainViewModel : ViewModel() {
    private val counter = CounterImpl()

    private val _countLiveData = MutableLiveData(0)

    val countLiveData: LiveData<Int>
        get() = _countLiveData

    // Actions
    fun addButtonClick() {
        // 카운팅 하자
        counter.count()
        _countLiveData.value = counter.value
    }
}