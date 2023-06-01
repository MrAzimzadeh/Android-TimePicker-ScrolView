package com.azimzada.scrollviewkulllanimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.azimzada.scrollviewkulllanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goTOTimePicker.setOnClickListener()
        {
            var intent = Intent(this@MainActivity , TimePickerActivity::class.java)
            startActivity(intent)
        }
    }
}