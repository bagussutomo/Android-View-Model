package com.ksm.submissionviewmodel.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ksm.submissionviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewPager(binding.viewPager)
        initUi()
    }

    private fun initUi() {
        binding.tabLayout.setupWithViewPager(binding.viewPager)
        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MovieFragment(), "Movie")
        adapter.addFragment(TvShowFragment(), "Tv Show")

        viewPager.adapter = adapter
    }

    class ViewPagerAdapter(supportFragmentManager: FragmentManager):
            FragmentPagerAdapter(supportFragmentManager) {
        private var fragmentList1: ArrayList<Fragment> = ArrayList()
        private var fragmentTitleList1: ArrayList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList1[position]
        }

        override fun getPageTitle(position: Int): CharSequence {
            return fragmentTitleList1[position]
        }

        override fun getCount(): Int {
            return fragmentList1.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            this.fragmentList1.add(fragment)
            this.fragmentTitleList1.add(title)
        }
    }
}