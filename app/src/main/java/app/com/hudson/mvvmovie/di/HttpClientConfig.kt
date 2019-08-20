package app.com.hudson.mvvmovie.di

import android.util.Log
import app.com.hudson.mvvmovie.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response

class HttpClientConfig {

    fun getHttpClient(): OkHttpClient {
        val client = OkHttpClient.Builder()
            .addInterceptor(object : Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val originalHttpURL = original.url()

                    val url = originalHttpURL.newBuilder()
                        .addQueryParameter("apikey", BuildConfig.API_KEY)
                        .build()
                    Log.i("testeUrlhttp",  url.host()+url.encodedQuery())
                    val requestBuilder = original.newBuilder().url(url)
                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            }).build()
        return client
    }

}