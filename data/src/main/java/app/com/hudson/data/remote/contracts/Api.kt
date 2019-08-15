package app.com.hudson.data.remote.contracts

import app.com.hudson.data.Responses.MovieResponse
import retrofit2.http.GET

interface Api {

    @GET("")
    fun getMovies(): List<MovieResponse>

}