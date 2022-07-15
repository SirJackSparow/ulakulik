package com.example.newskeletoncompose.view

import android.view.LayoutInflater
import com.example.core.base.BaseActivity
import com.example.newskeletoncompose.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onInit() {

    }

    override fun getActivityBinding(layoutinflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutinflater)
    }
}
