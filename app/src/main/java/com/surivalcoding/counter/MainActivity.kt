package com.surivalcoding.counter

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.surivalcoding.counter.databinding.ActivityMainBinding

// View
class MainActivity : AppCompatActivity() {
    // 늦은 초기화
    // by : 델리게이트 (위임)
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    // 상태
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")

        setContentView(binding.root)

        // UI 갱신
        viewModel.countLiveData.observe(this) { count ->
            binding.countTextView.text = count.toString()
        }


        // 동작
        binding.addButton.setOnClickListener {
            // 값이 변경 (로직)
            viewModel.addButtonClick()
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