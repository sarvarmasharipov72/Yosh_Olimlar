package com.example.yosholimlar.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.yosholimlar.models.News
import com.example.yosholimlar.repository.Repository

class NewsViewModel : ViewModel() {

    val repository = Repository()
    var getNews: LiveData<List<News>> = repository.getNews()


}