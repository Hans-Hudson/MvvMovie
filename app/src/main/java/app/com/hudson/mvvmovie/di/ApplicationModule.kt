package app.com.hudson.mvvmovie.di

import app.com.hudson.data.remote.contracts.Api
import app.com.hudson.mvvmovie.BuildConfig
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApplicationModule {
    val instances = module {

        single<Api> {
            Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(HttpClientConfig().getHttpClient())
                .build()
                .create(Api::class.java)
        }
    }
}