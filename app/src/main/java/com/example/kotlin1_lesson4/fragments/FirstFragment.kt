package com.example.kotlin1_lesson4.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_lesson4.MainViewModel
import com.example.kotlin1_lesson4.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var viewModel: MainViewModel

    private  lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.firsBtn.setOnClickListener{
            viewModel.add()

        }
        binding.secondBtn.setOnClickListener{
            viewModel.minus()
        }

    }

}