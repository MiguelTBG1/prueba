package com.example.modeloisic

import android.app.Application
import com.example.modeloisic.di.appModules
import org.koin.core.context.startKoin


class AplicacionDI: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AplicacionDI)
            modules(appModules)

        }
    }
}