package com.example.statesofnigeria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.statesofnigeria.R
import com.example.statesofnigeria.databinding.FragmentStatesListBinding


class StatesListFragment : Fragment() {

    private lateinit var binding: FragmentStatesListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStatesListBinding.inflate(inflater, container, false)

        return binding.root
    }

}