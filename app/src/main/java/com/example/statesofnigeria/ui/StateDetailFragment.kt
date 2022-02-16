package com.example.statesofnigeria.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.statesofnigeria.R
import com.example.statesofnigeria.databinding.FragmentStateDetailBinding


class StateDetailFragment : Fragment() {

    private lateinit var binding: FragmentStateDetailBinding

    private val navigationArgs: StateDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStateDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val state = navigationArgs.state

        binding.stateTitle.text = state.name
        binding.capitalTextView.text = getString(R.string.state_capital, state.capital)
        binding.stateAliasTextView.text = getString(R.string.state_alias, state.alias)
        binding.governorTextView.text = getString(R.string.state_governor, state.governor)
        binding.populationTextView.text = getString(R.string.state_population, state.population)
    }


}