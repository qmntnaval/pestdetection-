package com.example.pestdetect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pestdetect.databinding.FragmentHomeBinding

class HomeFragment : AppCompatActivity() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)

    }
}