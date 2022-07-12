package com.example.newskeletoncompose.view

import android.view.LayoutInflater
import com.example.core.base.BaseActivity
import com.example.newskeletoncompose.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun onInit() {
        return
    }

    override fun getActivityBinding(layoutinflater: LayoutInflater): ActivitySplashBinding {
        return ActivitySplashBinding.inflate(layoutinflater)
    }
}
