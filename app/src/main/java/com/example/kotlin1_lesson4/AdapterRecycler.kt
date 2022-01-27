package com.example.kotlin1_lesson4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1_lesson4.databinding.ItemCountBinding

class AdapterRecycler(var list: MutableList<String>): RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCountBinding.inflate
            (LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(private var binding: ItemCountBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(s: String) {
            binding.recycler.text = s
        }
    }
}