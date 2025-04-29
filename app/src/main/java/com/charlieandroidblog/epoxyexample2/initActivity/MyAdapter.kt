package com.charlieandroidblog.epoxyexample2.initActivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.charlieandroidblog.epoxyexample2.R

class MyAdapter(val al:ArrayList<Pair<String,String>>, val context:Context ):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.my_item_layout,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = al.get(position)
        (holder as MyViewHolder).bind(al.get(position))
        //holder.bind(item)
    }

    override fun getItemCount(): Int {
        return al.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)  {


        fun bind(pair:Pair<String,String>){
            itemView.findViewById<TextView>(R.id.tv_title).text = pair.first
            itemView.findViewById<TextView>(R.id.tv_subtitle).text = pair.second
        }
    }


}