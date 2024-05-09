package com.example.pestdetect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pestdetect.databinding.FragmentResult2Binding

class ResultFragment : AppCompatActivity() {

    private lateinit var binding: FragmentResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentResult2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
