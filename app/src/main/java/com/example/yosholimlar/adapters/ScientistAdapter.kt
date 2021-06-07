package com.example.yosholimlar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.yosholimlar.R
import com.example.yosholimlar.models.Scientist

class ScientistAdapter: RecyclerView.Adapter<ScientistAdapter.ScientistHolder>() {
    private var list: List<Scientist> = emptyList()
    class ScientistHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgScientist = view.findViewById<ImageView>(R.id.imgScientist)
        val nameScientist = view.findViewById<TextView>(R.id.nameScientist)
        val description = view.findViewById<TextView>(R.id.description)
        fun bind(scientist: Scientist){
            imgScientist.load(scientist.img){
                placeholder(R.drawable.ic_person)
            }
            nameScientist.text = scientist.name
            description.text = scientist.description
        }
    }
    fun setData(list: List<Scientist>){
        this.list = list
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScientistHolder {
        return ScientistHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_scientist,parent,false))
    }

    override fun onBindViewHolder(holder: ScientistHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}