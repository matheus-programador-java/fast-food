package com.maquina.foodmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maquina.foodmenu.R.layout.main_content
import com.maquina.foodmenu.databinding.MainContentBinding

class MainContent : Fragment() {

    private lateinit var binding: MainContentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MainContentBinding.inflate(inflater)
        return binding.root
//        return inflater.inflate(R.layout.main_content, container, false)
    }

}