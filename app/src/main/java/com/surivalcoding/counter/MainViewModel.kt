package com.surivalcoding.counter

// ViewModel
class MainViewModel(val counter: Counter) {
    val count: Int
        get() = counter.value

    // Actions
    fun addButtonClick() {
        // 카운팅 하자
        counter.count()
    }
}