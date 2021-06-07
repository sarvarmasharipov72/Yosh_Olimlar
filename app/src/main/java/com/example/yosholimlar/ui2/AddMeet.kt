package com.example.yosholimlar.ui2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.yosholimlar.R
import com.example.yosholimlar.models.Meet
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AddMeet : Fragment() {

    lateinit var database: DatabaseReference
    lateinit var nameAdd: EditText
    lateinit var imgAdd: EditText
    lateinit var descriptionAdd: EditText
    lateinit var timeAdd: TextView
    lateinit var dateAdd: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_add_meet, container,false)
        nameAdd = root.findViewById(R.id.nameAdd)
        imgAdd = root.findViewById(R.id.imgAdd)
        descriptionAdd = root.findViewById(R.id.descriptionAdd)
        timeAdd = root.findViewById(R.id.timeAdd)
        dateAdd = root.findViewById(R.id.dateAdd)
        root.findViewById<Button>(R.id.meetAdd).apply{
            setOnClickListener {
                if (checkData()) {
                    database = FirebaseDatabase.getInstance().getReference("Meet")
                    database.child("meet").setValue(Meet(date = dateAdd.text.toString(),time =  ))
                }

            }
        }
            return root
    }

    private fun checkData(): Boolean {
        return !nameAdd.text.isEmpty() && !imgAdd.text.isEmpty() && !descriptionAdd.text.isEmpty() && timeAdd.text != "00:00" && dateAdd.text != "00-00-0000"
    }

}