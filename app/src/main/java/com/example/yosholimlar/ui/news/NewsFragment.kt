package com.example.yosholimlar.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yosholimlar.R
import com.example.yosholimlar.adapters.NewsAdapter

class NewsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_news, container, false)
        val viewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
        val adapter = NewsAdapter()
        val ricycleView = root.findViewById<RecyclerView>(R.id.recyclerNews)
        ricycleView.adapter = adapter
        ricycleView.layoutManager = LinearLayoutManager(requireContext())
        viewModel.getNews.observe(viewLifecycleOwner, Observer {
            adapter.setData(it)
        })
        return root
    }
}