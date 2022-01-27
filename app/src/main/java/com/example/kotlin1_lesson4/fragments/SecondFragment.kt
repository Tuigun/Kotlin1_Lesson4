package com.example.kotlin1_lesson4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_lesson4.MainViewModel
import com.example.kotlin1_lesson4.R
import com.example.kotlin1_lesson4.databinding.FragmentFirstBinding
import com.example.kotlin1_lesson4.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var viewModel: MainViewModel

    private  lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.counter.observe(requireActivity(),{
            binding.text.text = it.toString()
        })

    }




}