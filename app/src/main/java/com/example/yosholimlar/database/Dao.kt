package com.example.yosholimlar.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.yosholimlar.models.Meet

@Dao
class Dao {

    @Query("SELECT * FROM meet ORDER BY id DESC")
    fun readMeet(): LiveData<List<Meet>>
}