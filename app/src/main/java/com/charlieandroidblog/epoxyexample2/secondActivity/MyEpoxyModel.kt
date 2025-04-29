package com.charlieandroidblog.epoxyexample2.secondActivity

import com.charlieandroidblog.epoxyexample2.R
import com.charlieandroidblog.epoxyexample2.databinding.MyItemLayoutBinding
import com.charlieandroidblog.epoxyexample2.helper.ViewBindingKotlinModel

data class MyEpoxyModel (
    val pair : Pair<String,String>
) : ViewBindingKotlinModel<MyItemLayoutBinding>(R.layout.my_item_layout)
{
    override fun MyItemLayoutBinding.bind() {
        tvTitle.text = pair.first
        tvSubtitle.text = pair.second
    }
}


