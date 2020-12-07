package com.maquina.foodmenu

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
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

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = MainContentBinding.inflate(inflater)

        ViewModelProvider(this).get(MainContentViewModel::class.java).selectedBtnId =
            binding.btnPizza.id

        binding.btnLanche.setOnClickListener(View.OnClickListener {
            binding.navHost.findNavController().navigate(R.id.lancheFrag)
            setActiveButton(it as Button)
        })

        binding.btnPizza.setOnClickListener(View.OnClickListener {
            binding.navHost.findNavController().navigate(R.id.pizzaFrag)
            setActiveButton(it as Button)
        })

        binding.btnPorcao.setOnClickListener(View.OnClickListener {
            binding.navHost.findNavController().navigate(R.id.porcaoFrag)
            setActiveButton(it as Button)
        })

        binding.btnRefri.setOnClickListener(View.OnClickListener {
            binding.navHost.findNavController().navigate(R.id.porcaoFrag)
            setActiveButton(it as Button)
        })

        binding.btnBebidas.setOnClickListener(View.OnClickListener {
            binding.navHost.findNavController().navigate(R.id.porcaoFrag)
            setActiveButton(it as Button)
        })

        binding.imgMenu.setOnClickListener(View.OnClickListener {
            binding.root.rootView.findViewById<View>(R.id.main_activity).apply {
                ActivityMainBinding.bind(this).let { b -> b.root.open() }
            }
        })

        binding.imgWpp.setOnClickListener(View.OnClickListener {

            val builder = AlertDialog.Builder(context)
            val layoutInflater = requireActivity().layoutInflater

            builder.setTitle("Contato")
            builder.setView(layoutInflater.inflate(R.layout.fragment_contato_dlg, null))
            builder.setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, _ ->
                {
                    dialog.dismiss()
                }
            })
            builder.create()
            builder.show()
        })

        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onResume() {
        super.onResume()
        val findNavController = binding.navHost.findNavController()

        binding.root.rootView.findViewById<NavigationView>(R.id.navigation)
            .let {
                it.setupWithNavController(findNavController)
                it.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener {

                    var activeButton: Button
                    var selectedButton: Button

                    ViewModelProvider(this).get(MainContentViewModel::class.java).selectedBtnId.also {
                        activeButton = binding.root.findViewById<Button>(it)
                    }

                    when (it.itemId) {
                        R.id.lancheFrag -> selectedButton = binding.btnLanche
                        R.id.pizzaFrag -> selectedButton = binding.btnPizza
                        R.id.porcaoFrag -> selectedButton = binding.btnPorcao
                        else -> selectedButton = binding.btnPizza
                    }

                    onNavigateChangeBtnSkin(this, resources, activeButton, selectedButton)

                    binding.root.rootView.findViewById<View>(R.id.main_activity).apply {
                        ActivityMainBinding.bind(this).let { b -> b.root.close() }
                    }

                    true
                })
            }
    }

    @SuppressLint("RestrictedApi")
    private fun setActiveButton(clickedBtn: Button) {
        ViewModelProvider(this).get(MainContentViewModel::class.java).also {
            val oldButton = binding.root.findViewById<Button>(it.selectedBtnId)
            onNavigateChangeBtnSkin(this, resources, oldButton, clickedBtn)
        }
    }

    private fun onNavigateChangeBtnSkin(
        owner: ViewModelStoreOwner,
        resources: Resources,
        oldButton: Button,
        clickedBtn: Button,
    ) {
        ViewModelProvider(owner).get(MainContentViewModel::class.java).also {
            setBlackButton(resources, clickedBtn)
            setWhiteButton(resources, oldButton)
            it.selectedBtnId = clickedBtn.id
        }
    }

    private fun setWhiteButton(resources: Resources, btn: Button) {
        btn.background =
            ResourcesCompat.getDrawable(resources, R.drawable.custom_white_button, null)
        btn.setTextColor(ResourcesCompat.getColor(resources, R.color.black, null))
    }

    private fun setBlackButton(resources: Resources, btn: Button) {
        btn.background =
            ResourcesCompat.getDrawable(resources, R.drawable.custom_white_black, null)
        btn.setTextColor(ResourcesCompat.getColor(resources, R.color.white, null))
    }
}

