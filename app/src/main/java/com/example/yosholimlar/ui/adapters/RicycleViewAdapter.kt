package com.example.yosholimlar.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yosholimlar.R
import com.example.yosholimlar.ui.models.NewsModel

class RicycleViewAdapter(var list: List<NewsModel>):
    RecyclerView.Adapter<RicycleViewAdapter.MyViewHolder>() {
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.imageView1)
        val text1 = view.findViewById<TextView>(R.id.text1)
        val text2 = view.findViewById<TextView>(R.id.text1_1)
        fun bindView(newsModel: NewsModel){
            image.setImageResource(newsModel.image)
            text1.text = newsModel.text1
            text2.text = newsModel.text2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}