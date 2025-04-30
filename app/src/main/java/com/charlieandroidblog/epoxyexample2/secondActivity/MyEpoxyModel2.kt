package com.charlieandroidblog.epoxyexample2.secondActivity

import com.charlieandroidblog.epoxyexample2.R
import com.charlieandroidblog.epoxyexample2.databinding.MyItemLayout2Binding
import com.charlieandroidblog.epoxyexample2.databinding.MyItemLayoutBinding
import com.charlieandroidblog.epoxyexample2.helper.ViewBindingKotlinModel

data class MyEpoxyModel2 (
    val pair : Pair<String,String>
) : ViewBindingKotlinModel<MyItemLayout2Binding>(R.layout.my_item_layout2)
{

    override fun MyItemLayout2Binding.bind() {
        tvTitle.text = pair.first
        tvSubtitle.text = pair.second
    }
}


