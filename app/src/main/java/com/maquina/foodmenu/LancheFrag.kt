package com.maquina.foodmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maquina.foodmenu.databinding.FragmentLancheBinding

class LancheFrag : Fragment() {

    private lateinit var binding: FragmentLancheBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLancheBinding.inflate(inflater)
        return binding.root
    }
}