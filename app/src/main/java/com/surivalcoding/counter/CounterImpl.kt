package com.surivalcoding.counter

class CounterImpl: Counter {
    private var number = 0

    override val value: Int
        get() = number

    override fun count() {
        number++
    }
}
