package com.example.lessonsneco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lessonsneco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val a = 123
    val b = 222

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickAdd(view: View) {
        val result = a + b
        binding.textViewResult.text = "Результат сложения равен: $result"
    }

    fun onClickSub(view: View) {
        val result = a - b
        binding.textViewResult.text = "Результат вычитания равен: $result"
    }
    fun onClickMlp(view: View) {
        val result = a * b
        binding.textViewResult.text = "Результат умножения равен: $result"
    }
}