package com.ironclad.conduit.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ironclad.conduit.databinding.FragmentFeedBinding

class GlobalFeedFragment : Fragment() {

    private var binding: FragmentFeedBinding? = null
    private lateinit var viewModel: FeedViewModel
    private lateinit var mAdapter: ArticleFeedAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(FeedViewModel::class.java)
        mAdapter = ArticleFeedAdapter()

        binding?.rvFeeds?.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = mAdapter
        }
        viewModel.fetchGlobalFeed()

        viewModel.feed.observe({ lifecycle }) {
            mAdapter.submitList(it)
        }

        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}