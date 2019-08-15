package app.com.hudson.mvvmovie.di

import app.com.hudson.data.remote.contracts.Api
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApplicationModule {
    val instances = module {

        single<Api>{
            Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api::class.java)
        }
    }
}