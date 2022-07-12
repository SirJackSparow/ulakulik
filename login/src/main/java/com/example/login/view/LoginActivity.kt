package com.example.login.view

import android.view.LayoutInflater
import com.example.core.base.BaseActivity
import com.example.login.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override fun onInit() {
        return
    }
    override fun getActivityBinding(layoutinflater: LayoutInflater): ActivityLoginBinding {
        return ActivityLoginBinding.inflate(layoutinflater)
    }
}
