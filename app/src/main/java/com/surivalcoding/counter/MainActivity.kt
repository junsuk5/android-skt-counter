package com.surivalcoding.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// View
class MainActivity : AppCompatActivity() {
    // 상태
    private val viewModel = MainViewModel(CounterImpl())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button
        val addButton = findViewById<Button>(R.id.add_button)
        // 가운데 숫자
        val countTextView = findViewById<TextView>(R.id.count_text_view)

        // 동작
        addButton.setOnClickListener {
            // 값이 변경 (로직)
            viewModel.addButtonClick()
            viewModel.addButtonClick()

            // UI 갱신
            countTextView.text = viewModel.count.toString()
        }
    }
}