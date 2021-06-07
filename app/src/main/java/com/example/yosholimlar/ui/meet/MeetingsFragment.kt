package com.example.yosholimlar.ui.meet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yosholimlar.adapters.MeetAdapter
import com.example.yosholimlar.databinding.FragmentMeetingsBinding

class MeetingsFragment : Fragment() {

    private lateinit var meetingsViewModel: MeetingsViewModel
    private var _binding: FragmentMeetingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        meetingsViewModel =
            ViewModelProvider(this).get(MeetingsViewModel::class.java)

        _binding = FragmentMeetingsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val adapter = MeetAdapter()
        binding.recyclerMeet.adapter = adapter
        binding.recyclerMeet.layoutManager = LinearLayoutManager(requireContext())
        meetingsViewModel.getMeet.observe(viewLifecycleOwner, Observer {
            adapter.setData(it)
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}