package me.dio.simulator.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator.databinding.ActivityMainBinding

class MainActivityOld : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        //val tvhello= findViewById<TextView>(R.id.tvhello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.tvhello.text = "Teste"
    }
}