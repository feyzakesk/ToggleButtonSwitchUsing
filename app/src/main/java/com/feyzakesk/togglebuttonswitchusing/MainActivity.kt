package com.feyzakesk.togglebuttonswitchusing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.feyzakesk.togglebuttonswitchusing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Log.e("Switch","ON")
            }else{
                Log.e("Switch","OFF")
            }
        }

        binding.toggleButton.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Log.e("Toggle Button","ON")
            }else{
                Log.e("Toggle Button","OFF")
            }
        }

        binding.button.setOnClickListener {
            val switchDurum = binding.switch1.isChecked
            val toggleButtonDurum = binding.toggleButton.isChecked

            Log.e("Switch Durum" ,switchDurum.toString())
            Log.e("Toggle Button  Durum" ,toggleButtonDurum.toString())
        }


    }
}