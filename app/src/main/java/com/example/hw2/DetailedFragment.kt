package com.example.hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.DEFAULT_ARGS_KEY
import androidx.navigation.fragment.findNavController
import coil.load

class DetailedFragment : Fragment(R.layout.fragment_detailed){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button2)

        button.setOnClickListener {
        findNavController().navigate(R.id.action_detailedFragment_to_musicFragment)}
    }
}