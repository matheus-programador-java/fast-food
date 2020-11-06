package com.maquina.foodmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.navigation.NavigationView
import com.maquina.foodmenu.R.layout.main_content
import com.maquina.foodmenu.databinding.ActivityMainBinding
import com.maquina.foodmenu.databinding.MainContentBinding

class MainContent : Fragment() {

    private lateinit var binding: MainContentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainContentBinding.inflate(inflater)

        binding.btnPizza.setOnClickListener(View.OnClickListener {
            println("Pizza Click")
            binding.navHost.findNavController().navigate(R.id.pizzaFrag)
        })

        binding.btnLanche.setOnClickListener(View.OnClickListener {
            binding.navHost.findNavController().navigate(R.id.lancheFrag)
        })

        binding.imgMenu.setOnClickListener(View.OnClickListener {
            val fView = binding.root.rootView.findViewById<View>(R.id.main_activity)
            ActivityMainBinding.bind(fView).let { b ->
                b.root.open()
            }
        })

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val findNavController = binding.navHost.findNavController()
        activity?.findViewById<NavigationView>(R.id.navigation)
            ?.apply { this.setupWithNavController(findNavController) }

    }
}