package com.charlieandroidblog.epoxyexample2.secondActivity

import com.airbnb.epoxy.EpoxyController

class MyEpoxyController : EpoxyController() {


    var items: ArrayList<Pair<String,String>> = ArrayList<Pair<String,String>>()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        items.forEach { item ->
            MyEpoxyModel(item)
                .id(items.indexOf(item))
                .addTo(this)
        }
    }

}