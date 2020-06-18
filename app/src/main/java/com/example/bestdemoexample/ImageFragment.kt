package com.example.bestdemoexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.bestdemoexample.databinding.FragmentImageBinding

class ImageFragment : Fragment() {

    private lateinit var binding: FragmentImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_image, container, false )

        binding.imageView2.setImageResource(R.drawable.sugar_cube1)

        binding.imageButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_imageFragment_to_imageDemoFragment)
        }

        binding.videoButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_imageFragment_to_videoFragment)
        }

        return binding.root
    }

}