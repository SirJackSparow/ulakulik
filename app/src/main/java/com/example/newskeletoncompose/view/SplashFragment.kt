package com.example.newskeletoncompose.view
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.dynamicfeatures.DynamicInstallMonitor
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.core.base.BaseFragment
import com.example.newskeletoncompose.R
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
       return FragmentSplashBinding.inflate(inflater,container,false)
    }

    override fun onInit() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(100)
            val navigationFragment = childFragmentManager.findFragmentById(R.id.splashFragment)
            navigationFragment!!.findNavController().navigate(R.id.action_splashFragment_to_loginGraph)
        }
    }
}
