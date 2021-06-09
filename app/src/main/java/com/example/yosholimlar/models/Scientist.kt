package com.example.yosholimlar.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "scienrist")
data class Scientist (@PrimaryKey(autoGenerate = true) val id:Int = 0,
                      val name: String,
                      val img: Int,
                      val description: String)
fun getScientist(): List<Scientist>{
    return listOf()
}