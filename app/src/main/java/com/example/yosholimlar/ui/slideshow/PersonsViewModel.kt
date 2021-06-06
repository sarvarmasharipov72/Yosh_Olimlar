package com.example.yosholimlar.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Yosh olimlar"
    }
    val text: LiveData<String> = _text
}