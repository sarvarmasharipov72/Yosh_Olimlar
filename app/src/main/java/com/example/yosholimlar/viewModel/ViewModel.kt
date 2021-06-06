package com.example.yosholimlar.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.yosholimlar.models.Meet
import com.example.yosholimlar.models.News
import com.example.yosholimlar.models.getScientist
import com.example.yosholimlar.repisitory.Repository

class ViewModel: ViewModel() {
    var getNews: LiveData<List<News>>
    var getMeet: LiveData<List<Meet>>
    val getScientist = getScientist()
    val repository: Repository
    init {
        repository = Repository()
        getNews = repository.getNews()
        getMeet = repository.getMeet()
    }
}