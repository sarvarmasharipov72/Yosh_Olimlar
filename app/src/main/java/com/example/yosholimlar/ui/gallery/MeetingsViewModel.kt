package com.example.yosholimlar.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MeetingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Seminarlar"
    }
    val text: LiveData<String> = _text
}