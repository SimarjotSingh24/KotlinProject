package com.example.kotlinproject.utils

import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication

class Application : MultiDexApplication()
{
    override fun onCreate()
    {
        super.onCreate()
        MultiDex.install(this)
    }
}
