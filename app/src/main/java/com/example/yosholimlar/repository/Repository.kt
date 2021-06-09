package com.example.yosholimlar.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.yosholimlar.models.Meet
import com.example.yosholimlar.models.News
import com.google.firebase.database.*

class Repository {
    val database = FirebaseDatabase.getInstance()
    val referenceNews: DatabaseReference = database.getReference("News")
    val referenceMeet: DatabaseReference = database.getReference("News")

    fun getNews(): LiveData<List<News>>{
        var list = MutableLiveData<List<News>>()
        var list1 = ArrayList<News>()

        referenceNews.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                for (i in snapshot.children){
                    val data = i.getValue(News::class.java)
                    list1.add(data as News)
                }
                list.value = list1
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("cancel",error.toString())
            }

        })
        return list
    }
    fun getMeet(): LiveData<List<Meet>>{
        var list = MutableLiveData<List<Meet>>()
        var list1 = ArrayList<Meet>()

        referenceMeet.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                for (i in snapshot.children){
                    val data = i.getValue(Meet::class.java)
                    list1.add(data as Meet)
                }
                list.value = list1
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("cancel",error.toString())
            }

        })
        return list
    }
}