package com.maquina.foodmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maquina.foodmenu.databinding.FragmentPorcaoBinding

class PorcaoFrag : Fragment() {

    private lateinit var binding: FragmentPorcaoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPorcaoBinding.inflate(inflater)
        return binding.root
    }

}