package com.example.newskeletoncompose.view

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.core.base.BaseFragment
import com.example.newskeletoncompose.databinding.FragmentSplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding? {
        return FragmentSplashBinding.inflate(inflater, container, false)
    }

    override fun onInit() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(100)
        }
    }
}
