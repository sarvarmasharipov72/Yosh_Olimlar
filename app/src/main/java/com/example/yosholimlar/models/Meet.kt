package com.example.yosholimlar.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meet")
data class Meet(@PrimaryKey(autoGenerate = true) val id: Int = 0,
                val date: String? = null,
                val img: String? = null
                ,val link: String? = null
                ,val subject: String? = null
                ,val time:String? = null

                )
