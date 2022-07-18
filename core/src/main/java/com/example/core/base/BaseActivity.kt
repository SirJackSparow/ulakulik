package com.example.core.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<vb: ViewBinding?> : AppCompatActivity() {

    var bind : vb? = null
    //protected val dataStore : DataStorePreferences by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = getActivityBinding(layoutInflater)
        val view = bind?.root
        setContentView(view)
        onInit()
    }

    override fun onDestroy() {
        super.onDestroy()
        bind = null
    }

    abstract fun onInit()
    abstract fun getActivityBinding(layoutinflater: LayoutInflater ) : vb
}
