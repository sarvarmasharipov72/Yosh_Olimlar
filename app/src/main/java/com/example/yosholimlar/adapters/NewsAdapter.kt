package com.example.yosholimlar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.yosholimlar.R
import com.example.yosholimlar.models.News

class NewsAdapter():
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    private var list: List<News> = emptyList()
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgNews = view.findViewById<ImageView>(R.id.imgNews)
        val titleNews = view.findViewById<TextView>(R.id.titleNews)
        val descriptionNews = view.findViewById<TextView>(R.id.descriptionNews)
        fun bindView(news: News){
            imgNews.load(news.img){
                placeholder(R.drawable.ic_baseline_image_24)
            }
            titleNews.text = news.title
            descriptionNews.text = news.description
        }
    }
    fun setData(list: List<News>){
        this.list = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}