package com.surivalcoding.counter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.surivalcoding.counter.databinding.ActivityMainBinding

// View
class MainActivity : AppCompatActivity() {
    // 늦은 초기화
    private lateinit var binding: ActivityMainBinding

    // 상태
    private val viewModel = MainViewModel(CounterImpl())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 동작
        binding.addButton.setOnClickListener {
            // 값이 변경 (로직)
            viewModel.addButtonClick()

            // UI 갱신
            binding.countTextView.text = viewModel.count.toString()
        }
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }
}