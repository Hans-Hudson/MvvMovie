package app.com.hudson.data.remote.contracts

import app.com.hudson.data.Responses.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET(".")
    suspend fun getMovies(@Query("t") title: String): MovieResponse

}