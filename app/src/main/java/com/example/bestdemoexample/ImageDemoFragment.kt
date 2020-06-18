package com.example.bestdemoexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bestdemoexample.databinding.FragmentImageDemoBinding

class ImageDemoFragment : Fragment() {

    private lateinit var binding: FragmentImageDemoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_image_demo, container, false)

        binding.imageView.setImageResource(R.drawable.cutlery)


        return binding.root

    }

}