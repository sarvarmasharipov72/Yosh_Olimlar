package com.example.yosholimlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.yosholimlar.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tabs: TabLayout = findViewById(R.id.tabLayout)
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
        tabs.setupWithViewPager(viewPager)

    }
}