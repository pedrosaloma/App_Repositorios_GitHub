package com.salomao.app_repositorios_github

import android.app.Application
import com.salomao.app_repositorios_github.data.DataModule
import com.salomao.app_repositorios_github.domain.DomainModule
import com.salomao.app_repositorios_github.presentation.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}