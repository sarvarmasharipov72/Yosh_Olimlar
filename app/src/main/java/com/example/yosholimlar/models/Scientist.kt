package com.example.yosholimlar.models

data class Scientist (val id:Int,
                        val name: String,
                        val img: Int,
                        val description: String)
fun getScientist(): List<Scientist>{
    return listOf()
}