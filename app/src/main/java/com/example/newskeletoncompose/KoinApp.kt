package com.example.newskeletoncompose

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newskeletoncompose.module.moduleListApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class KoinApp : Application() {
    private var instance: KoinApp? = null

    fun getInstance(): KoinApp? {
        return instance
    }

    fun getContext(): Context? {
        return instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin {
            androidContext(this@KoinApp)
            modules(moduleListApp)
        }
    }
}
