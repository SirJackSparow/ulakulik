package com.example.core.base
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<vb: ViewBinding> : Fragment() {

    private var bind:vb? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = getFragmentBinding(inflater, container)
        return bind?.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onInit()
    }

    override fun onDestroy() {
        super.onDestroy()
        bind = null
    }

    abstract fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): vb?
    abstract fun onInit()
}
