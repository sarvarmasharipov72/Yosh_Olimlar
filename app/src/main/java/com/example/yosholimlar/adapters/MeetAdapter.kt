package com.example.yosholimlar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.yosholimlar.R
import com.example.yosholimlar.models.Meet

class MeetAdapter: RecyclerView.Adapter<MeetAdapter.MeetHolder>() {
    private var list = emptyList<Meet>()
    class MeetHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgMeet = view.findViewById<ImageView>(R.id.imgMeet)
        val subjectMeet = view.findViewById<TextView>(R.id.subjectMeet)
        val timeMeet = view.findViewById<TextView>(R.id.timeMeet)
        val dateMeet = view.findViewById<TextView>(R.id.dateMeet)
        fun bind(meet: Meet){
            imgMeet.load(meet.img){
                placeholder(R.drawable.ic_meetings)
            }
            subjectMeet.text = meet.subject
            timeMeet.text = meet.time
            dateMeet.text = meet.data

        }
    }
    fun setData(list: List<Meet>){
        this.list = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeetHolder {
        return MeetHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_meet,parent,false))
    }

    override fun onBindViewHolder(holder: MeetHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}