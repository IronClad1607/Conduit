package com.ironclad.conduit.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ironclad.conduit.R
import com.ironclad.conduit.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel
    private lateinit var binding: FragmentSlideshowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)
        binding = FragmentSlideshowBinding.inflate(inflater, container, false)

        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textSlideshow.text = it
        })
        return binding.root
    }
}