package com.example.yosholimlar.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yosholimlar.R
import com.example.yosholimlar.ui.adapters.RicycleViewAdapter
import com.example.yosholimlar.ui.models.NewsModel

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        var list: List<NewsModel> =
            listOf(NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi..."),
                NewsModel(R.drawable.seminar1, "31 may kuni Iqtisodiy taraqqiyot va kambag‘allikni qisqartirish vazirligida, vazirning birinchi o‘rinbosari Ilhom Norqulov Birlashgan Millatlar Tashkilotining Bolalar jamg‘armasi (UNICEF) vakillari...", "Uchrashuvning asosiy mavzusi koronavirus pandemiyasining O‘zbekistondagi...")
        )
        val adapter = RicycleViewAdapter(list)
        val ricycleView = root.findViewById<RecyclerView>(R.id.recycler_view)
        ricycleView.adapter = adapter
        ricycleView.layoutManager = LinearLayoutManager(requireContext())
        return root
    }
}