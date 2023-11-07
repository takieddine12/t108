package com.z.nestedscrolling

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(var list : MutableList<Int>) : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {

    inner class SimpleViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var image : ImageView = itemView.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simple_item_layout,parent,false)
        return  SimpleViewHolder(view)
    }


    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        val image = list[position]
        holder.image.setImageResource(image)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}