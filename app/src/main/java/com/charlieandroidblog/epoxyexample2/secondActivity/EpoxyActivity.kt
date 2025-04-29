package com.charlieandroidblog.epoxyexample2.secondActivity

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.EpoxyRecyclerView
import com.charlieandroidblog.epoxyexample2.Provider.Companion.getRandomValues
import com.charlieandroidblog.epoxyexample2.R

class EpoxyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_epoxy)

        val controller = MyEpoxyController()

        var rv = findViewById<EpoxyRecyclerView>(R.id.erv_charlie)
        rv.setController(controller)

        controller.items = getRandomValues()

    }

    fun goBack(view: View) {
     this.finish()
    }

}