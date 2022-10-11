package com.example.fragements

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragements.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() ,Communicator {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var trans: FragmentTransaction
    private lateinit var fragmentOne: FragmentOne
    private lateinit var fragmentTwo: FragmentTwo

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        assignComponents()
    }
    private fun assignComponents(){
        fragmentManager = supportFragmentManager
        trans = fragmentManager.beginTransaction()
        fragmentOne = FragmentOne()
        fragmentTwo= FragmentTwo()
        add(fragmentOne)
    }
    private fun add(fragment: Fragment) {
        trans.add(binding.frame.id,fragment)
        trans.commit()
    }

    private fun replace(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_right)
        transaction.replace(binding.frame.id, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun startAction(s:String) {
        fragmentTwo.text=s
        replace(fragmentTwo)
    }
}
