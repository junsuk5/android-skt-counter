package com.surivalcoding.counter

import org.junit.Assert.*
import org.junit.Test

class MainViewModelTest {

    @Test
    fun `버튼 클릭 잘 되어야 한다`() {
        val viewModel = MainViewModel(MockCounter())

        assertEquals(10, viewModel.count)

        viewModel.addButtonClick()
        assertEquals(9, viewModel.count)

        viewModel.addButtonClick()
        assertEquals(8, viewModel.count)

        repeat(10) {
            viewModel.addButtonClick()
        }
        assertEquals(0, viewModel.count)

        repeat(10) {
            viewModel.addButtonClick()
        }
        assertEquals(0, viewModel.count)
    }
}

class MockCounter : Counter {
    var count = 10

    override val value: Int
        get() = count

    override fun count() {
        if (count == 0) {
            return
        }
        count--
    }
}