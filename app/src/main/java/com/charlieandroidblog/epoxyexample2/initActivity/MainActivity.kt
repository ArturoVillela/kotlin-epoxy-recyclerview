package com.charlieandroidblog.epoxyexample2.initActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.charlieandroidblog.epoxyexample2.secondActivity.EpoxyActivity
import com.charlieandroidblog.epoxyexample2.Provider.Companion.getRandomValues
import com.charlieandroidblog.epoxyexample2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val randomPairData = getRandomValues()
        val adapter = MyAdapter(randomPairData, this)
        val rv = findViewById<RecyclerView>(R.id.rv_charlie)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
        adapter.notifyDataSetChanged()
    }


    fun startEpoxyActivity(view: View) {
        startActivity(Intent(this, EpoxyActivity::class.java))
    }

}