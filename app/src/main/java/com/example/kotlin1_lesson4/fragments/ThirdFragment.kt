package com.example.kotlin1_lesson4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1_lesson4.AdapterRecycler
import com.example.kotlin1_lesson4.MainViewModel
import com.example.kotlin1_lesson4.R
import com.example.kotlin1_lesson4.databinding.FragmentFirstBinding
import com.example.kotlin1_lesson4.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    lateinit var viewModel: MainViewModel
    lateinit var adapterRecycler: AdapterRecycler


    private  lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentThirdBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        initAdapter()
        viewModel.text.observe(requireActivity()) {
            val list = mutableListOf(it)
            with(binding.recycler){
                adapterRecycler = AdapterRecycler(list)
                adapter = adapterRecycler
            }
        }
    }

    private fun initAdapter() {

    }

}