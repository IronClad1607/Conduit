package com.ironclad.conduit.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ironclad.conduit.databinding.FragmentFeedBinding

class GlobalFeedFragment : Fragment() {

    private var binding: FragmentFeedBinding? = null
    private lateinit var viewModel: FeedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(FeedViewModel::class.java)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}