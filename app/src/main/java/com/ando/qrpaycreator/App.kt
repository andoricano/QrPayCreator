package com.ando.qrpaycreator

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        Log.i("Choi_App","context : ${applicationContext.hashCode()}")
        super.onCreate()
    }
}