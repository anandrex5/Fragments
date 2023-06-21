package com.company0ne.fragmentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.Fragment1
import com.Fragment2
import com.company0ne.fragmentskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(dataBinding.root)


        dataBinding.fragmentButton1.setOnClickListener {
            replaceFragment(Fragment1())
        }

        dataBinding.fragmentButton2.setOnClickListener {
            replaceFragment(Fragment2())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}