package com.example.yosholimlar.ui2

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.yosholimlar.R
import com.example.yosholimlar.models.Meet
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class AddMeet : Fragment(),TimePickerDialog.OnTimeSetListener,DatePickerDialog.OnDateSetListener {

    lateinit var database: DatabaseReference
    lateinit var nameAdd: EditText
    lateinit var imgAdd: EditText
    lateinit var descriptionAdd: EditText
    lateinit var timeAdd: TextView
    lateinit var dateAdd: TextView
    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0
    var savedday = 0
    var savedmonth = 0
    var savedyear = 0
    var savedhour = 0
    var savedminute = 0
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
                    database = FirebaseDatabase.getInstance().reference
                    var id = database.key
                    val user = Meet(
                        date = dateAdd.text.toString(),
                        time = timeAdd.text.toString(),
                        link = descriptionAdd.text.toString(),
                        subject = nameAdd.text.toString(),
                        img = imgAdd.text.toString()
                    )
                    database.setValue(user).addOnSuccessListener {
                            dateAdd.text = "00-00-0000"
                            timeAdd.text = "00:00"
                            nameAdd.text.clear()
                            imgAdd.text.clear()
                            descriptionAdd.text.clear()
                    }.addOnFailureListener {
                        Log.e("eror",it.toString())
                    }
                }

            }
        }
        pickData()
            return root
    }
    private fun getCalendar(){
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)
    }
    private fun pickData() {
        timeAdd.setOnClickListener {
            getCalendar()
            TimePickerDialog(requireContext(),this,hour,minute,true).show()
        }
        dateAdd.setOnClickListener {
            getCalendar()
            DatePickerDialog(requireContext(),this,year,month,day).show()
        }

    }

    private fun checkData(): Boolean {
        return !nameAdd.text.isEmpty() && !imgAdd.text.isEmpty() && !descriptionAdd.text.isEmpty() && timeAdd.text != "00:00" && dateAdd.text != "00-00-0000"
    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        timeAdd.text = "$hourOfDay:$minute"
    }

    @SuppressLint("SetTextI18n")
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        dateAdd.text = "$dayOfMonth-$month-$year"
    }

}