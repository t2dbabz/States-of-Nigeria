package com.example.statesofnigeria.ui.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.statesofnigeria.databinding.StatesListItemViewBinding
import com.example.statesofnigeria.model.State

class StateListAdapter(
    private val clickListener: (State) -> Unit
) : ListAdapter<State, StateListAdapter.StateViewHolder>(DiffCallback) {

    class StateViewHolder(private var binding: StatesListItemViewBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(state: State) {
            binding.state.text = state.name
            binding.stateCapital.text = state.capital
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return StateViewHolder(StatesListItemViewBinding.inflate(layoutInflater, parent, false))

    }

    override fun onBindViewHolder(holder: StateViewHolder, position: Int) {
        val state = getItem(position)
        holder.itemView.setOnClickListener {
            clickListener(state)
        }
        holder.bind(state)
    }

    companion object DiffCallback: DiffUtil.ItemCallback<State>() {
        override fun areItemsTheSame(oldItem: State, newItem: State): Boolean {
            return oldItem.capital == newItem.capital
        }

        override fun areContentsTheSame(oldItem: State, newItem: State): Boolean {
            return oldItem == newItem
        }

    }
}