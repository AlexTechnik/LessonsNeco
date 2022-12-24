package com.example.lessonsneco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.lessonsneco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonResult.setOnClickListener {
            if (binding.editTextVal.text.isNotEmpty()) {
                val result: Int = binding.editTextVal.text.toString().toInt()
                var textBlogResult: String = "Вы суперзвезда!"
                Log.d("MyLog", "Ввод числа подписчиков: $result")
                binding.textViewResult.visibility = View.VISIBLE

                when(result) {
                    in 0..1000 -> textBlogResult = "Вы начинающий блогер"
                    in 1000..100000 -> textBlogResult = "Вы средний блогер"
                }

                binding.textViewResult.text = textBlogResult
            }
        }

    }
}