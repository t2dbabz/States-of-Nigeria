package com.example.statesofnigeria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.statesofnigeria.R
import com.example.statesofnigeria.data.DataSource
import com.example.statesofnigeria.databinding.FragmentStatesListBinding
import com.example.statesofnigeria.ui.adapter.StateListAdapter


class StatesListFragment : Fragment() {

    private lateinit var binding: FragmentStatesListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStatesListBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = StateListAdapter { state ->  
            val action = StatesListFragmentDirections.actionStatesListFragmentToStateDetailFragment(state)
            findNavController().navigate(action)
        }
        val stateList = DataSource().loadStates()
        adapter.submitList(stateList)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.hasFixedSize()
    }

}