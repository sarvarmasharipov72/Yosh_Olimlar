package com.example.yosholimlar.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.yosholimlar.ui2.AddMeet
import com.example.yosholimlar.ui2.AddNews
import com.example.yosholimlar.ui2.AddScientist

class ViewPagerAdapter(supportFragmentManager: FragmentManager): FragmentPagerAdapter(
    supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> { return AddMeet()
            }
            1 -> { return AddNews()
            }
            2 -> {return AddScientist()}
            else -> { return AddMeet()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Konfrensiya"
            1 -> return "Yangilik"
            2 -> return "Yosh Olim"
        }
        return super.getPageTitle(position)
    }

}