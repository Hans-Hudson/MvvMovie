package app.com.hudson.mvvmovie.core

import android.app.Application
import app.com.hudson.mvvmovie.di.ApplicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(listOf(ApplicationModule.instances))

        }
    }

}