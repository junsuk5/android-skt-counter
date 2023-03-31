package com.surivalcoding.counter

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class CounterImplTest {
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `카운트가 1씩 증가되어야 한다`() {
        val counter = CounterImpl()
        counter.count()
        assertEquals(1, counter.value)
        counter.count()
        assertEquals(2, counter.value)
        counter.count()
        assertEquals(3, counter.value)
    }
}