package com.example.fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.fragements.databinding.FragmentOneBinding


class FragmentOne : Fragment() {

    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val v: View? = inflater.inflate(R.layout.fragment_one, container, false)
//        val btn: Button? = v?.findViewById(R.id.btn)

        val binding:FragmentOneBinding=FragmentOneBinding.inflate(inflater,container,false)
        communicator = activity as MainActivity
        binding.btn.setOnClickListener {

            communicator.startAction("Hello World ❤")
        }
        return binding.root
    }
}