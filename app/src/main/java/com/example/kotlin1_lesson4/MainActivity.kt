package com.example.kotlin1_lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1_lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ViewPagerAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this)
        binding.vPager.adapter = adapter

    }
}