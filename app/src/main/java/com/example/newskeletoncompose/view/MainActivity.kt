package com.example.newskeletoncompose.view

import android.view.LayoutInflater
import androidx.navigation.fragment.NavHostFragment
import com.example.core.base.BaseActivity
import com.example.newskeletoncompose.R
import com.example.newskeletoncompose.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onInit() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
    }

    override fun getActivityBinding(layoutinflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutinflater)
    }
}
