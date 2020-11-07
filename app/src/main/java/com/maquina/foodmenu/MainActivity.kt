package com.maquina.foodmenu

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
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
    }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        println("Navigate Called!")
//        val mainContentBinding =
//            MainContentBinding.bind(binding.root.findViewById(R.id.main_content))
//
//        var activeButton: Button
//        var selectedButton: Button
//
////        Buttons capture
//        ViewModelProvider(this).get(MainContentViewModel::class.java).selectedBtnId.also {
//            activeButton = mainContentBinding.root.findViewById<Button>(it)
//        }
//
//        when (item.itemId) {
//            R.id.lancheFrag -> selectedButton = mainContentBinding.btnLanche
//            R.id.pizzaFrag -> selectedButton = mainContentBinding.btnPizza
//            R.id.porcaoFrag -> selectedButton = mainContentBinding.btnPorcao
//            else -> selectedButton = mainContentBinding.btnPizza
//        }
//
//        MainContent.Companion.onNavigateChangeBtnSkin(this, resources, activeButton, selectedButton)
//
//        return true
//    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)

    }
}