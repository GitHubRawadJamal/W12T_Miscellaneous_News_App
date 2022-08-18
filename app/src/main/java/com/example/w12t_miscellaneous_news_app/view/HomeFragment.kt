package com.example.w12t_miscellaneous_news_app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.w12t_miscellaneous_news_app.databinding.FragmentHomeBinding
import com.example.w12t_miscellaneous_news_app.view.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(){

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding =FragmentHomeBinding::inflate
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
    }

    override fun setup(){

    }
}