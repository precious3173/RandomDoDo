package com.example.randomdodo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomdodo.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.button.setOnClickListener {

            val random = Random()
            var color: Int = Color.argb(220, random!!.nextInt(300), random.nextInt(300), random.nextInt(300) )

            binding!!.view.setBackgroundColor(color)
        }

    }
}