package com.example.yosholimlar.ui.scientist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yosholimlar.R
import com.example.yosholimlar.adapters.ScientistAdapter

class ScientistFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel =
            ViewModelProvider(this).get(ScientistViewModel::class.java)


        val root: View = inflater.inflate(R.layout.fragment_scientist,container,false)
        val recyclerView = root.findViewById<RecyclerView>(R.id.recyclerScientist)
        val adapter = ScientistAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter.setData(viewModel.getScientist)


        return root
    }

}