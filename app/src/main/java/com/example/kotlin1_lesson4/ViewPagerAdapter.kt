package com.example.kotlin1_lesson4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlin1_lesson4.fragments.FirstFragment
import com.example.kotlin1_lesson4.fragments.SecondFragment
import com.example.kotlin1_lesson4.fragments.ThirdFragment

class ViewPagerAdapter(fragment :FragmentActivity): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecondFragment()
            }
            2 -> {
                ThirdFragment()
            }
            else -> {
                FirstFragment()
            }

        }
    }
}