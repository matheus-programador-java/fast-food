package com.maquina.foodmenu

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.maquina.foodmenu.databinding.ActivityMainBinding
import com.maquina.foodmenu.databinding.MainContentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT




//        binding.mainActivity.findViewById<Button>(R.id.btn_pizza).apply {
//            setOnClickListener(View.OnClickListener { v ->
//
//                println("Pizza Click")
//                val findNavController = binding.mainActivity.findNavController()
//                if(findNavController != null){
//                    println("Not null")
//                }else{
//                    println("Is null")
//                }
////                findNavController().navigate(R.id.frag_pizza)
//            })
//        }

//        binding.root.findViewById<Button>(R.id.btn_pizza).apply {
//            setOnClickListener(View.OnClickListener { v ->
//
//                println("Pizza Click")
//
////                findNavController().navigate(R.id.frag_pizza)
//            })
//        }



//
//        binding.root.findViewById<Button>(R.id.btn_pizza).apply {
//            setOnClickListener { v ->
//                Toast.makeText(
//                    v.context, "Pizza Click", Toast.LENGTH_SHORT
//                )
//                println("Pizza Click")
//            }
//        }
    }
}