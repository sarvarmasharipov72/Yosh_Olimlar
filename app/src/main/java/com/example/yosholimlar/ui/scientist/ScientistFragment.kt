package com.example.yosholimlar.ui.scientist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.yosholimlar.databinding.FragmentPersonsBinding

class ScientistFragment : Fragment() {

    private lateinit var personsViewModel: ScientistViewModel
    private var _binding: FragmentPersonsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        personsViewModel =
            ViewModelProvider(this).get(ScientistViewModel::class.java)

        _binding = FragmentPersonsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}