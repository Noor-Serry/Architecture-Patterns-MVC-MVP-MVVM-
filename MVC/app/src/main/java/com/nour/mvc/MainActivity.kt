package com.nour.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nour.mvc.data.FakeData
import com.nour.mvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val fakeData = FakeData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.noteTextView.text = fakeData.getRandomNote()
        }

    }
}