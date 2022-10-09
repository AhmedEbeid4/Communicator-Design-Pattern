package com.example.fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragements.databinding.FragmentOneBinding
import com.example.fragements.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    var text:String?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v:View?=inflater.inflate(R.layout.fragment_two, container, false)
        val txtView: TextView? =v?.findViewById(R.id.txt)
        val binding: FragmentTwoBinding = FragmentTwoBinding.inflate(inflater,container,false)

        binding.txt.text=text.toString()
        return binding.root;
    }

}