package com.example.yosholimlar.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "news")
data class News(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val img: String? = null,
    val title: String? = null,
    val description: String? = null
)
