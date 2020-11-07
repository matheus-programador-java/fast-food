package com.maquina.foodmenu

import android.content.res.Resources
import android.view.View
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModel

class MainContentViewModel: ViewModel() {

    var selectedBtnId: Int = 0

    fun setWhiteButton(resources:Resources, btn: Button) {
        btn.background =
            ResourcesCompat.getDrawable(resources, R.drawable.custom_white_button, null)
        btn.setTextColor(ResourcesCompat.getColor(resources, R.color.black, null))
    }

}