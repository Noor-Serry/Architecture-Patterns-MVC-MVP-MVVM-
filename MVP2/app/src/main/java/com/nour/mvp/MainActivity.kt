package com.nour.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nour.mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , ViewInterface {
    lateinit var binding: ActivityMainBinding
    val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
        presenter.getNote() }

    }

    override fun getNote(note: String?) {
        binding.noteTextView.text = note
    }
}