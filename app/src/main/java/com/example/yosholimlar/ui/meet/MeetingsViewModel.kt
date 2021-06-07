package com.example.yosholimlar.ui.meet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yosholimlar.models.Meet
import com.example.yosholimlar.repisitory.Repository

class MeetingsViewModel : ViewModel() {

    var getMeet: LiveData<List<Meet>> = Repository().getMeet()
}